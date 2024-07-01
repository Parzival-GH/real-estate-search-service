package com.example.finalproject.services;

import com.example.finalproject.models.TransactionType;
import com.example.finalproject.repositories.TransactionTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionTypeService {
    List<TransactionType> getAllTransactionType();
    TransactionType getReferenceById(Integer id);
}
