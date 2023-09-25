package com.example.task.controllers;

import com.example.task.dtos.UserDto;
import com.example.task.exceptions.IdNotFoundException;
import com.example.task.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserDto addUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

    @GetMapping("{id}")
    public UserDto findUser(@PathVariable("id") Integer id) throws IdNotFoundException {
        return userService.findUserById(id);
    }

    @PutMapping("{id}")
    public UserDto updateUser(@PathVariable("id") Integer id, @RequestBody UserDto userDto) throws IdNotFoundException {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable("id") Integer id) throws IdNotFoundException {
        userService.deleteUser(id);
    }
}
