package com.example.finalproject.repositories;

import com.example.finalproject.models.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyTypeRepo extends JpaRepository<PropertyType, Integer> {
    List<PropertyType> findAll();
}
