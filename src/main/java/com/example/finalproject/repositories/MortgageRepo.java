package com.example.finalproject.repositories;

import com.example.finalproject.models.Mortgage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MortgageRepo extends JpaRepository<Mortgage, Integer> {
    List<Mortgage> findAll();
}
