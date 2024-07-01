package com.example.finalproject.repositories;

import com.example.finalproject.models.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExchangeRepo extends JpaRepository<Exchange, Integer> {
    List<Exchange> findAll();
}
