package com.example.task.controllers;

import com.example.task.exceptions.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionsHandlerController {
    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(IdNotFoundException ex) {
        String errorBody = "{\"message\" : \"" + ex.getMessage() + "\"}";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).contentType(MediaType.APPLICATION_JSON).body(errorBody);
    }
}