package com.example.finalproject.services;

import com.example.finalproject.models.PriceType;
import com.example.finalproject.repositories.PriceTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PriceTypeService {
    List<PriceType> getAllPriceType();
    PriceType getReferenceById(Integer id);
}
