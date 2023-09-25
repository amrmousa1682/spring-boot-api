package com.example.task.repositories;

import com.example.task.entities.Advertise;
import com.example.task.entities.Category;
import com.example.task.entities.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class AdvertiseRepositoryTests {

    @Autowired
    private AdvertiseRepository advertiseRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @BeforeEach
    void addDataInDataBase() {
        User user = User.builder()
                .name("amr")
                .email("amr@test")
                .password("1682")
                .phoneNumber("010")
                .address("test")
                .build();
        Category category = Category.builder()
                .name("test").build();
        user = userRepository.save(user);
        category = categoryRepository.save(category);
        Advertise advertise = Advertise.builder()
                .title("test")
                .description("test des")
                .price(50)
                .user(user)
                .category(category)
                .build();
        advertiseRepository.save(advertise);
    }

    @Test
    void test_findAllByPrefixWithRightPrefix_returnArrayOfAdvertise() {
        //Arrange

        //Act
        List<Advertise> advertises = advertiseRepository.findAllByPrefix("t");

        //Assert
        Assertions.assertThat(advertises).isNotNull().hasSize(1);
    }

    @Test
    void test_findAllByPrefixWithWrongPrefix_returnEmptyArray() {
        //Arrange


        //Act
        List<Advertise> advertises = advertiseRepository.findAllByPrefix("e");

        //Assert
        Assertions.assertThat(advertises).isNotNull().isEmpty();
    }

    @Test
    void test_findAllByNullPrefix_returnEmptyArray() {
        //Arrange


        //Act
        List<Advertise> advertises = advertiseRepository.findAllByPrefix(null);

        //Assert
        Assertions.assertThat(advertises).isNotNull().isEmpty();
    }

    @Test
    void test_findAllByPrefixAndCategoryIdWithRightPrefixAndCategoryId_returnArrayOfAdvertise() {
        //Arrange


        //Act
        List<Advertise> advertises = advertiseRepository.findAllByPrefixAndCategory("t", 1);

        //Assert
        Assertions.assertThat(advertises).isNotNull().hasSize(1);
    }

    @Test
    void test_findAllByPrefixAndCategoryIdWithWrongPrefixAndRightCategoryId_returnEmptyArray() {
        //Arrange


        //Act
        List<Advertise> advertises = advertiseRepository.findAllByPrefixAndCategory("e", 1);

        //Assert
        Assertions.assertThat(advertises).isNotNull().isEmpty();
    }

    @Test
    void test_findAllByPrefixAndCategoryIdWithRightPrefixAndWrongCategoryId_returnEmptyArray() {
        //Arrange


        //Act
        List<Advertise> advertises = advertiseRepository.findAllByPrefixAndCategory("t", 2);

        //Assert
        Assertions.assertThat(advertises).isNotNull().isEmpty();
    }
}