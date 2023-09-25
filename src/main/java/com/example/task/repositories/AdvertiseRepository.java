package com.example.task.repositories;

import com.example.task.entities.Advertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertiseRepository extends JpaRepository<Advertise, Integer> {
    @Query("select a from Advertise a where (a.title) like (concat(?1, '%')) ")
    List<Advertise> findAllByPrefix(String title);

    @Query("select a from Advertise a where (a.title) like (concat(?1, '%')) and a.category.id = ?2")
    List<Advertise> findAllByPrefixAndCategory(String title, Integer id);

    List<Advertise> findByCategory_Id(Integer id);


}