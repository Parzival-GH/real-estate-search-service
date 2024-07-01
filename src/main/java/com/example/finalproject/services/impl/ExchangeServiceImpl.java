package com.example.finalproject.services.impl;

import com.example.finalproject.models.Exchange;
import com.example.finalproject.repositories.ExchangeRepo;
import com.example.finalproject.services.ExchangeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService {
    private final ExchangeRepo exchangeRepo;

    public ExchangeServiceImpl(ExchangeRepo exchangeRepo) {
        this.exchangeRepo = exchangeRepo;
    }

    @Override
    public List<Exchange> getAllExchange() {
        return exchangeRepo.findAll();
    }

    @Override
    public Exchange getReferenceById(Integer id) {
        return exchangeRepo.getReferenceById(id);
    }
}
