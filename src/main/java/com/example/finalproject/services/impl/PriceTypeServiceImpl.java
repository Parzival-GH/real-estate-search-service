package com.example.finalproject.services.impl;

import com.example.finalproject.models.PriceType;
import com.example.finalproject.repositories.PriceTypeRepo;
import com.example.finalproject.services.PriceTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceTypeServiceImpl implements PriceTypeService {

    private final PriceTypeRepo priceTypeRepo;

    public PriceTypeServiceImpl(PriceTypeRepo priceTypeRepo) {
        this.priceTypeRepo = priceTypeRepo;
    }

    @Override
    public List<PriceType> getAllPriceType() {
        return priceTypeRepo.findAll();
    }

    @Override
    public PriceType getReferenceById(Integer id) {
        return priceTypeRepo.getReferenceById(id);
    }

}