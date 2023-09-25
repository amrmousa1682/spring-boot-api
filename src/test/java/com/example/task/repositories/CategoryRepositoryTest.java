package com.example.task.repositories;

import com.example.task.entities.Category;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = org.springframework.boot.jdbc.EmbeddedDatabaseConnection.H2)
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;
    @BeforeEach
    void addCategory(){
        Category category = Category.builder()
                .name("test").build();
        categoryRepository.save(category);
    }

    @Test
    void test_findAllByPrefixWithRightPrefix_returnArrayOfCategory() {
        //Arrange

        //Act
        List<Category> categories = categoryRepository.findAllByPrefix("t");

        //Assert
        Assertions.assertThat(categories).isNotNull().hasSize(1);

    }

    @Test
    void test_findAllByPrefixWithWrongPrefix_returnEmptyArray() {
        //Arrange

        //Act
        List<Category> categories = categoryRepository.findAllByPrefix("a");

        //Assert
        Assertions.assertThat(categories).isNotNull().isEmpty();
    }

    @Test
    void test_findAllByPrefixWithNullPrefix_returnEmptyArray() {
        //Arrange

        //Act
        List<Category> categories = categoryRepository.findAllByPrefix(null);

        //Assert
        Assertions.assertThat(categories).isNotNull().isEmpty();
    }
}