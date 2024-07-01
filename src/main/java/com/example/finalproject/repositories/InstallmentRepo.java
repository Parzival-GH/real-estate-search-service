package com.example.finalproject.repositories;

import com.example.finalproject.models.Installment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstallmentRepo extends JpaRepository<Installment, Integer> {
    List<Installment> findAll();
}
