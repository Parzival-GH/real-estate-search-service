package com.example.finalproject.repositories;

import com.example.finalproject.models.TypeOfStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeOfStructureRepo extends JpaRepository<TypeOfStructure, Integer> {
    List<TypeOfStructure> findAll();
}
