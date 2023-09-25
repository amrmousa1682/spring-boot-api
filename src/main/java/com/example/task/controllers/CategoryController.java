package com.example.task.controllers;

import com.example.task.dtos.CategoryDto;
import com.example.task.exceptions.IdNotFoundException;
import com.example.task.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CategoryDto addCategory(@RequestBody CategoryDto categoryDto) {
        return categoryService.addCategory(categoryDto);
    }

    @GetMapping
    public List<CategoryDto> findAllCategories() {
        return categoryService.findAllCategories();
    }

    @GetMapping(params = "prefix")
    public List<CategoryDto> findAllCategoriesByPrefix(@RequestParam("prefix") String prefix) {
        return categoryService.findAllCategoriesByPrefix(prefix);
    }

    @GetMapping("{id}")
    public CategoryDto findCategoryById(@PathVariable("id") Integer id) throws IdNotFoundException {
        return categoryService.findCategoryById(id);
    }
    @PutMapping("{id}")
    public CategoryDto updateCategory(@PathVariable("id") Integer id, @RequestBody CategoryDto categoryDto) throws IdNotFoundException {
        return categoryService.updateCategory(id, categoryDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable("id") Integer id) throws IdNotFoundException {
        categoryService.deleteCategory(id);
    }
}
