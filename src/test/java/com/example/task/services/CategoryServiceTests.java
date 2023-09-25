package com.example.task.services;

import com.example.task.dtos.CategoryDto;
import com.example.task.entities.Category;
import com.example.task.mappers.CategoryMapper;
import com.example.task.repositories.CategoryRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class CategoryServiceTests {
    static Category category = Category.builder()
            .id(1)
            .name("test")
            .build();
    CategoryDto categoryDto = CategoryDto.builder()
            .name("test")
            .build();
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private CategoryMapper categoryMapper;

    @InjectMocks
    private CategoryServiceImp categoryServiceImp;

    @Test
    void test_addCategoryWithValidData_ReturnCategoryDto() {
        // Arrange
        when(categoryRepository.save(category)).thenReturn(category);
        when(categoryMapper.toEntity(categoryDto)).thenReturn(category);
        when(categoryMapper.toDto(category)).thenReturn(categoryDto);
        // Act
        CategoryDto result = categoryServiceImp.addCategory(categoryDto);
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(categoryDto);
    }

    @Test
    void test_findCategoryByIdWithValidId_ReturnCategoryDto() {
        // Arrange
        when(categoryRepository.existsById(1)).thenReturn(true);
        when(categoryRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(category));
        when(categoryMapper.toDto(category)).thenReturn(categoryDto);
        // Act
        CategoryDto result = categoryServiceImp.findCategoryById(1);
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(categoryDto);
    }

    @Test
    void test_updateCategoryWithValidData_ReturnCategoryDto() {
        // Arrange
        when(categoryRepository.existsById(1)).thenReturn(true);
        when(categoryRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(category));
        when(categoryRepository.save(category)).thenReturn(category);
        when(categoryMapper.toEntity(categoryDto)).thenReturn(category);
        when(categoryMapper.toDto(category)).thenReturn(categoryDto);
        categoryDto.setName("test update");
        // Act
        CategoryDto result = categoryServiceImp.updateCategory(1, categoryDto);
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(categoryDto);
        Assertions.assertThat(result.getName()).isEqualTo("test update");
    }

    @Test
    void test_deleteCategoryWithValidId_ReturnVoid() {
        // Arrange
        when(categoryRepository.existsById(1)).thenReturn(true);
        // Act
        // Assert
        assertAll(()->categoryServiceImp.deleteCategory(1));
    }

    @Test
    void test_findAllCategories_ReturnListOfCategoryDto() {
        // Arrange
        when(categoryRepository.findAll()).thenReturn(java.util.List.of(category));
        when(categoryMapper.toDto(category)).thenReturn(categoryDto);
        // Act
        java.util.List<CategoryDto> result = categoryServiceImp.findAllCategories();
        // Assert
        Assertions.assertThat(result).isNotNull().hasSize(1);
    }

    @Test
    void test_findAllCategoriesByPrefixWithValidPrefix_ReturnListOfCategoryDto() {
        // Arrange
        when(categoryRepository.findAllByPrefix("test")).thenReturn(java.util.List.of(category));
        when(categoryMapper.toDto(category)).thenReturn(categoryDto);
        // Act
        java.util.List<CategoryDto> result = categoryServiceImp.findAllCategoriesByPrefix("test");
        // Assert
        Assertions.assertThat(result).isNotNull().hasSize(1).contains(categoryDto);
    }
}
