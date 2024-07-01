package com.example.finalproject.repositories;

import com.example.finalproject.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Integer> {
    List<Currency> findAll();

}
