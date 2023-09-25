package com.example.task.services;

import com.example.task.dtos.AdvertiseDto;
import com.example.task.entities.Advertise;
import com.example.task.exceptions.IdNotFoundException;
import com.example.task.mappers.AdvertiseMapper;
import com.example.task.repositories.AdvertiseRepository;
import com.example.task.repositories.CategoryRepository;
import com.example.task.repositories.UserRepository;
import com.example.task.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AdvertiseServiceImp implements AdvertiseService {


    private final AdvertiseRepository advertiseRepository;
    private final AdvertiseMapper advertiseMapper;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    @Autowired
    public AdvertiseServiceImp(AdvertiseRepository advertiseRepository, AdvertiseMapper advertiseMapper, CategoryRepository categoryRepository, UserRepository userRepository) {
        this.advertiseRepository = advertiseRepository;
        this.advertiseMapper = advertiseMapper;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public AdvertiseDto addAdvertise(AdvertiseDto advertiseDto) throws IdNotFoundException {
        Util.checkIfIdExists(categoryRepository, advertiseDto.getCategoryId());
        Util.checkIfIdExists(userRepository, advertiseDto.getUserId());
        Advertise advertise = advertiseMapper.toEntity(advertiseDto);
        advertise = advertiseRepository.save(advertise);
        return advertiseMapper.toDto(advertise);
    }

    @Override
    public AdvertiseDto findAdvertiseById(Integer id) throws IdNotFoundException {
        Util.checkIfIdExists(advertiseRepository, id);
        Advertise advertise = Objects.requireNonNull(advertiseRepository.findById(id).orElse(null));
        return advertiseMapper.toDto(advertise);
    }

    @Override
    public List<AdvertiseDto> findAllAdvertises() {
        return advertiseRepository
                .findAll().stream()
                .map(advertiseMapper::toDto)
                .toList();
    }

    @Override
    public List<AdvertiseDto> findAllAdvertisesByPrefix(String prefix) {
        return advertiseRepository
                .findAllByPrefix(prefix).stream()
                .map(advertiseMapper::toDto)
                .toList();
    }

    @Override
    public List<AdvertiseDto> findAllAdvertisesByCategory(Integer categoryId) throws IdNotFoundException {
        Util.checkIfIdExists(categoryRepository, categoryId);
        return advertiseRepository
                .findByCategory_Id(categoryId)
                .stream()
                .map(advertiseMapper::toDto)
                .toList();
    }

    @Override
    public List<AdvertiseDto> findAllAdvertisesByPrefixAndCategory(String prefix, Integer categoryId) throws IdNotFoundException {
        Util.checkIfIdExists(categoryRepository, categoryId);
        return advertiseRepository
                .findAllByPrefixAndCategory(prefix, categoryId)
                .stream()
                .map(advertiseMapper::toDto)
                .toList();
    }

    @Override
    public AdvertiseDto updateAdvertise(Integer id, AdvertiseDto advertiseDto) throws IdNotFoundException {
        Util.checkIfIdExists(advertiseRepository, id);
        Util.checkIfIdExists(categoryRepository, advertiseDto.getCategoryId());
        Advertise advertise = advertiseMapper.toEntity(advertiseDto);
        advertise.setId(id);
        Advertise oldAdvertise = Objects.requireNonNull(advertiseRepository.findById(id).orElse(null));
        advertise.setCreatedAt(oldAdvertise.getCreatedAt());
        return advertiseMapper.toDto(advertiseRepository.save(advertise));
    }

    @Override
    public void deleteAdvertise(Integer id) throws IdNotFoundException {
        Util.checkIfIdExists(advertiseRepository, id);
        advertiseRepository.deleteById(id);
    }
}
