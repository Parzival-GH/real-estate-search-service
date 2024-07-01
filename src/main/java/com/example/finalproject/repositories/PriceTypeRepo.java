package com.example.finalproject.repositories;

import com.example.finalproject.models.PriceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceTypeRepo extends JpaRepository<PriceType, Integer> {
    List<PriceType> findAll();
}
