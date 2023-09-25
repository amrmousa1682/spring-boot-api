package com.example.task.services;

import com.example.task.dtos.AdvertiseDto;
import com.example.task.entities.Advertise;
import com.example.task.mappers.AdvertiseMapper;
import com.example.task.repositories.AdvertiseRepository;
import com.example.task.repositories.CategoryRepository;
import com.example.task.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class AdvertiseServiceTests {
    Advertise advertise = Advertise.builder()
            .id(1)
            .title("test")
            .description("test des")
            .price(50)
            .user(UserServiceTests.user)
            .category(CategoryServiceTests.category)
            .build();
    AdvertiseDto advertiseDto = AdvertiseDto.builder()
            .title("test")
            .description("test des")
            .price(50)
            .userId(1)
            .categoryId(1)
            .build();
    @Mock
    private AdvertiseRepository advertiseRepository;
    @Mock
    private AdvertiseMapper advertiseMapper;
    @Mock
    private UserRepository userRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @InjectMocks
    private AdvertiseServiceImp advertiseServiceImp;

    @Test
    void test_addAdvertiseWithValidData_ReturnAdvertiseDto() {
        // Arrange
        when(userRepository.existsById(1)).thenReturn(true);
        when(categoryRepository.existsById(1)).thenReturn(true);
        when(advertiseRepository.save(advertise)).thenReturn(advertise);
        when(advertiseMapper.toEntity(advertiseDto)).thenReturn(advertise);
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        // Act
        AdvertiseDto result = advertiseServiceImp.addAdvertise(advertiseDto);
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(advertiseDto);
    }

    @Test
    void test_findAdvertiseByIdWithValidId_ReturnAdvertiseDto() {
        // Arrange
        when(advertiseRepository.existsById(1)).thenReturn(true);
        when(advertiseRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(advertise));
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        // Act
        AdvertiseDto result = advertiseServiceImp.findAdvertiseById(1);
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(advertiseDto);
    }

    @Test
    void test_findAllAdvertises_ReturnListOfAdvertiseDto() {
        // Arrange
        when(advertiseRepository.findAll()).thenReturn(java.util.List.of(advertise));
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        // Act
        java.util.List<AdvertiseDto> result = advertiseServiceImp.findAllAdvertises();
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(java.util.List.of(advertiseDto));
    }

    @Test
    void test_findAllAdvertisesByPrefix_ReturnListOfAdvertiseDto() {
        // Arrange
        when(advertiseRepository.findAllByPrefix("test")).thenReturn(java.util.List.of(advertise));
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        // Act
        java.util.List<AdvertiseDto> result = advertiseServiceImp.findAllAdvertisesByPrefix("test");
        // Assert
        Assertions.assertThat(result).isNotNull().hasSize(1).contains(advertiseDto);
    }

    @Test
    void test_findAllAdvertisesByCategoryWithValidId_ReturnListOfAdvertiseDto() {
        // Arrange
        when(categoryRepository.existsById(1)).thenReturn(true);
        when(advertiseRepository.findByCategory_Id(1)).thenReturn(java.util.List.of(advertise));
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        // Act
        java.util.List<AdvertiseDto> result = advertiseServiceImp.findAllAdvertisesByCategory(1);
        // Assert
        Assertions.assertThat(result).isNotNull().hasSize(1).contains(advertiseDto);
    }

    @Test
    void test_findAllAdvertisesByPrefixAndCategoryWithValidId_ReturnListOfAdvertiseDto() {
        // Arrange
        when(categoryRepository.existsById(1)).thenReturn(true);
        when(advertiseRepository.findAllByPrefixAndCategory("test", 1)).thenReturn(java.util.List.of(advertise));
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        // Act
        java.util.List<AdvertiseDto> result = advertiseServiceImp.findAllAdvertisesByPrefixAndCategory("test", 1);
        // Assert
        Assertions.assertThat(result).isNotNull().hasSize(1).contains(advertiseDto);
    }

    @Test
    void test_updateAdvertiseWithValidIdAndAdvertiseDto_ReturnAdvertiseDto() {
        // Arrange
        when(advertiseRepository.existsById(1)).thenReturn(true);
        when(categoryRepository.existsById(1)).thenReturn(true);
        when(advertiseRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(advertise));
        when(advertiseRepository.save(advertise)).thenReturn(advertise);
        when(advertiseMapper.toEntity(advertiseDto)).thenReturn(advertise);
        when(advertiseMapper.toDto(advertise)).thenReturn(advertiseDto);
        advertiseDto.setTitle("test updated");
        // Act
        AdvertiseDto result = advertiseServiceImp.updateAdvertise(1, advertiseDto);
        // Assert
        Assertions.assertThat(result).isNotNull().isEqualTo(advertiseDto);
        Assertions.assertThat(result.getTitle()).isEqualTo("test updated");
    }

    @Test
    void test_deleteAdvertiseWithValidId_ReturnVoid() {
        // Arrange
        when(advertiseRepository.existsById(1)).thenReturn(true);
        // Act
        // Assert
        assertAll(()->advertiseServiceImp.deleteAdvertise(1));
    }
}
