package com.example.finalproject.repositories;

import com.example.finalproject.models.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionTypeRepo extends JpaRepository<TransactionType, Integer> {
    List<TransactionType> findAll();
}
