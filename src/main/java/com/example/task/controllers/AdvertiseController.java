package com.example.task.controllers;

import com.example.task.dtos.AdvertiseDto;
import com.example.task.exceptions.IdNotFoundException;
import com.example.task.services.AdvertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("advertise")
public class AdvertiseController {
    private final AdvertiseService advertiseService;

    @Autowired
    public AdvertiseController(AdvertiseService advertiseService) {
        this.advertiseService = advertiseService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AdvertiseDto addAdvertise(@RequestBody AdvertiseDto advertiseDto) throws IdNotFoundException {
        return advertiseService.addAdvertise(advertiseDto);
    }

    @GetMapping
    public List<AdvertiseDto> findAllAdvertises() {
        return advertiseService.findAllAdvertises();
    }

    @GetMapping(params = "prefix")
    public List<AdvertiseDto> findAllAdvertisesByPrefix(@RequestParam("prefix") String prefix) {
        return advertiseService.findAllAdvertisesByPrefix(prefix);
    }

    @GetMapping(params = {"prefix", "categoryId"})
    public List<AdvertiseDto> findAllAdvertisesByPrefixAndCategoryId(@RequestParam("prefix") String prefix, @RequestParam("categoryId") Integer categoryId) throws IdNotFoundException {
        return advertiseService.findAllAdvertisesByPrefixAndCategory(prefix, categoryId);
    }
    @GetMapping(params = {"categoryId"})
    public List<AdvertiseDto> findAllAdvertisesByCategoryId(@RequestParam("categoryId") Integer categoryId) throws IdNotFoundException {
        return advertiseService.findAllAdvertisesByCategory(categoryId);
    }

    @GetMapping("{id}")
    public AdvertiseDto findAdvertiseById(@PathVariable("id") Integer id) throws IdNotFoundException {
        return advertiseService.findAdvertiseById(id);
    }

    @PutMapping("{id}")
    public AdvertiseDto updateAdvertise(@PathVariable("id") Integer id, @RequestBody AdvertiseDto advertiseDto) throws IdNotFoundException {
        return advertiseService.updateAdvertise(id, advertiseDto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteAdvertise(@PathVariable("id") Integer id) throws IdNotFoundException {
        advertiseService.deleteAdvertise(id);
    }
}
