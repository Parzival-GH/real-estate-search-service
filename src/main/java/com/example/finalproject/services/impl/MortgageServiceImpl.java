package com.example.finalproject.services.impl;

import com.example.finalproject.models.Mortgage;
import com.example.finalproject.repositories.MortgageRepo;
import com.example.finalproject.services.MortgageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MortgageServiceImpl implements MortgageService {
    private final MortgageRepo mortgageRepo;

    public MortgageServiceImpl(MortgageRepo mortgageRepo) {
        this.mortgageRepo = mortgageRepo;
    }

    @Override
    public List<Mortgage> getAllMortgage() {
        return mortgageRepo.findAll();
    }

    @Override
    public Mortgage getReferenceById(Integer id) {
        return mortgageRepo.getReferenceById(id);
    }
}
