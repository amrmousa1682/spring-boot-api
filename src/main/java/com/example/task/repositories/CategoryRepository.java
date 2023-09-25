package com.example.task.repositories;

import com.example.task.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("select c from Category c where (c.name) like (concat(?1, '%'))")
    List<Category> findAllByPrefix(String name);

}