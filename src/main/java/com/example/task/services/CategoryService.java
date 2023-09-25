package com.example.task.services;

import com.example.task.dtos.CategoryDto;
import com.example.task.exceptions.IdNotFoundException;

import java.util.List;

public interface CategoryService {
    CategoryDto addCategory(CategoryDto categoryDto);

    List<CategoryDto> findAllCategories();

    CategoryDto findCategoryById(Integer id) throws IdNotFoundException;

    List<CategoryDto> findAllCategoriesByPrefix(String prefix);
    CategoryDto updateCategory(Integer id,CategoryDto categoryDto) throws IdNotFoundException;
    void deleteCategory(Integer id) throws IdNotFoundException;
}
