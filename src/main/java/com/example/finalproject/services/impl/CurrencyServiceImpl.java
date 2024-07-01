package com.example.finalproject.services.impl;

import com.example.finalproject.models.Currency;
import com.example.finalproject.repositories.CurrencyRepo;
import com.example.finalproject.services.CurrencyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyRepo currencyRepo;

    public CurrencyServiceImpl(CurrencyRepo currencyRepo) {
        this.currencyRepo = currencyRepo;
    }

    @Override
    public List<Currency> getAllCurrency() {
        return currencyRepo.findAll();
    }

    @Override
    public Currency getReferenceById(Integer id) {
        return currencyRepo.getReferenceById(id);
    }
}
