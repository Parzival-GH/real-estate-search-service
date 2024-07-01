package com.example.finalproject.services;

import com.example.finalproject.models.Currency;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CurrencyService {
    List<Currency> getAllCurrency();

    Currency getReferenceById(Integer id);
}
