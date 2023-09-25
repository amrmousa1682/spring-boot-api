package com.example.task.services;

import com.example.task.dtos.CategoryDto;
import com.example.task.entities.Category;
import com.example.task.exceptions.IdNotFoundException;
import com.example.task.mappers.CategoryMapper;
import com.example.task.repositories.CategoryRepository;
import com.example.task.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CategoryServiceImp implements CategoryService{
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImp(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        Category category= categoryMapper.toEntity(categoryDto);
        category = categoryRepository.save(category);
        return categoryMapper.toDto(category);
    }
    @Override
    public List<CategoryDto> findAllCategories() {
        return categoryRepository.findAll().stream().map(categoryMapper::toDto).toList();
    }
    @Override
    public CategoryDto findCategoryById(Integer id) throws IdNotFoundException {
        Util.checkIfIdExists(categoryRepository,id);
        Category category= Objects.requireNonNull(categoryRepository.findById(id).orElse(null));
        return categoryMapper.toDto(category);
    }

    @Override
    public List<CategoryDto> findAllCategoriesByPrefix(String prefix) {
        return categoryRepository.findAllByPrefix(prefix).stream().map(categoryMapper::toDto).toList();
    }


    @Override
    public CategoryDto updateCategory(Integer id, CategoryDto categoryDto) throws IdNotFoundException {
        Util.checkIfIdExists(categoryRepository,id);
        Category category= categoryMapper.toEntity(categoryDto);
        category.setId(id);
        Category oldCategory = Objects.requireNonNull(categoryRepository.findById(id).orElse(null));
        category.setCreatedAt(oldCategory.getCreatedAt());
        return categoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public void deleteCategory(Integer id) throws IdNotFoundException {
        Util.checkIfIdExists(categoryRepository,id);
        categoryRepository.deleteById(id);
    }
}
