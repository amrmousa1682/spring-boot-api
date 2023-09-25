package com.example.task.mappers;

import com.example.task.dtos.CategoryDto;
import com.example.task.entities.Category;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    Category toEntity(CategoryDto categoryDto);

    @AfterMapping
    default void linkAdvertises(@MappingTarget Category category) {
        category.getAdvertises().forEach(advertise -> advertise.setCategory(category));
    }

    CategoryDto toDto(Category category);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category partialUpdate(CategoryDto categoryDto, @MappingTarget Category category);
}