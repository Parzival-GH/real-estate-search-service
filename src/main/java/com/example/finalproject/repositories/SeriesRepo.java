package com.example.finalproject.repositories;

import com.example.finalproject.models.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesRepo extends JpaRepository<Series, Integer> {
    List<Series> findAll();
}
