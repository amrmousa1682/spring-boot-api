package com.example.task.services;

import com.example.task.dtos.UserDto;
import com.example.task.entities.User;
import com.example.task.exceptions.IdNotFoundException;
import com.example.task.mappers.UserMapper;
import com.example.task.repositories.UserRepository;
import com.example.task.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImp implements UserService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Autowired
    public UserServiceImp(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }

    @Override
    public UserDto findUserById(Integer id) throws IdNotFoundException {
        Util.checkIfIdExists(userRepository, id);
        User user = Objects.requireNonNull(userRepository.findById(id).orElse(null));
        return userMapper.toDto(user);
    }

    @Override
    public UserDto updateUser(Integer id, UserDto userDto) throws IdNotFoundException {
        Util.checkIfIdExists(userRepository, id);
        User user = userMapper.toEntity(userDto);
        user.setId(id);
        User oldUser = Objects.requireNonNull(userRepository.findById(id).orElse(null));
        user.setCreatedAt(oldUser.getCreatedAt());
        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    public void deleteUser(Integer id) throws IdNotFoundException {
        Util.checkIfIdExists(userRepository, id);
        userRepository.deleteById(id);
    }
}
