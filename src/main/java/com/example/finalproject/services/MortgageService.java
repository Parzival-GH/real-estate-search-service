package com.example.finalproject.services;

import com.example.finalproject.models.Installment;
import com.example.finalproject.models.Mortgage;
import com.example.finalproject.repositories.MortgageRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MortgageService {
    List<Mortgage> getAllMortgage();
    Mortgage getReferenceById(Integer id);
}
