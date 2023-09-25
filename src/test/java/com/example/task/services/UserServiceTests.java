package com.example.task.services;

import com.example.task.dtos.UserDto;
import com.example.task.entities.User;
import com.example.task.mappers.UserMapper;
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
class UserServiceTests {
    static User user = User.builder()
            .id(1)
            .name("amr")
            .email("amr@test")
            .password("1682")
            .phoneNumber("010")
            .address("test")
            .build();
    UserDto userDto = UserDto.builder()
            .name("amr")
            .email("amr@test")
            .password("1682")
            .phoneNumber("010")
            .address("test")
            .build();
    @Mock
    private UserRepository userRepository;
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserServiceImp userService;

    @Test
    void test_addUserWithUserDto_ReturnAddedUser() {
        // Arrange
        when(userRepository.save(user)).thenReturn(user);
        when(userMapper.toEntity(userDto)).thenReturn(user);
        when(userMapper.toDto(user)).thenReturn(userDto);

        // Act
        UserDto addedUser = userService.addUser(userDto);

        // Assert
        Assertions.assertThat(addedUser).isNotNull();
    }
    @Test
    void test_findUserByIdWithId_ReturnUser() {
        // Arrange
        when(userRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(user));
        when(userRepository.existsById(1)).thenReturn(true);
        when(userMapper.toDto(user)).thenReturn(userDto);

        // Act
        UserDto foundUser = userService.findUserById(1);

        // Assert
        Assertions.assertThat(foundUser).isNotNull();
    }

    @Test
    void test_updateUserWithIdAndUserDto_ReturnUpdatedUser() {
        // Arrange
        when(userRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(user));
        when(userRepository.existsById(1)).thenReturn(true);
        when(userRepository.save(user)).thenReturn(user);
        when(userMapper.toEntity(userDto)).thenReturn(user);
        when(userMapper.toDto(user)).thenReturn(userDto);
        userDto.setName("test");
        // Act
        UserDto updatedUser = userService.updateUser(1, userDto);

        // Assert
        Assertions.assertThat(updatedUser).isNotNull();
        Assertions.assertThat(updatedUser.getName()).isEqualTo("test");
    }

    @Test
    void test_deleteUserWithId_ReturnNothing() {
        // Arrange
        when(userRepository.existsById(1)).thenReturn(true);

        // Act


        // Assert
        assertAll(()->userService.deleteUser(1));
    }
}
