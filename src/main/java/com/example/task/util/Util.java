package com.example.task.util;

import com.example.task.exceptions.IdNotFoundException;
import com.example.task.repositories.AdvertiseRepository;
import com.example.task.repositories.CategoryRepository;
import com.example.task.repositories.UserRepository;

public class Util {
    private Util() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> void checkIfIdExists(T repo, Integer id) throws IdNotFoundException {
        if (repo instanceof UserRepository userRepository && !userRepository.existsById(id))
            throw new IdNotFoundException();
        if (repo instanceof CategoryRepository categoryRepository && !categoryRepository.existsById(id))
            throw new IdNotFoundException();
        if (repo instanceof AdvertiseRepository advertiseRepository && !advertiseRepository.existsById(id))
            throw new IdNotFoundException();
    }
}
