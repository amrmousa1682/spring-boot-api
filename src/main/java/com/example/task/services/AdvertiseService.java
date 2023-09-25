package com.example.task.services;

import com.example.task.dtos.AdvertiseDto;
import com.example.task.exceptions.IdNotFoundException;

import java.util.List;

public interface AdvertiseService {
    AdvertiseDto addAdvertise(AdvertiseDto advertiseDto) throws IdNotFoundException;
    AdvertiseDto findAdvertiseById(Integer id) throws IdNotFoundException;

    List<AdvertiseDto> findAllAdvertises();

    List<AdvertiseDto> findAllAdvertisesByPrefix(String prefix);

    List<AdvertiseDto> findAllAdvertisesByCategory(Integer categoryId) throws IdNotFoundException;

    List<AdvertiseDto> findAllAdvertisesByPrefixAndCategory(String prefix, Integer categoryId) throws IdNotFoundException;

    AdvertiseDto updateAdvertise(Integer id, AdvertiseDto advertiseDto) throws IdNotFoundException;
    void deleteAdvertise(Integer id) throws IdNotFoundException;
}
