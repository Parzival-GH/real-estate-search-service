package com.example.finalproject.services;

import com.example.finalproject.models.Exchange;
import com.example.finalproject.repositories.ExchangeRepo;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExchangeService {
    List<Exchange> getAllExchange();
    Exchange getReferenceById(Integer id);
}
