package com.example.task.services;

import com.example.task.dtos.UserDto;
import com.example.task.exceptions.IdNotFoundException;

public interface UserService {
     UserDto addUser(UserDto userDto);
     UserDto findUserById(Integer id) throws IdNotFoundException;
     UserDto updateUser(Integer id,UserDto userDto) throws IdNotFoundException;
     void deleteUser(Integer id) throws IdNotFoundException;
}
