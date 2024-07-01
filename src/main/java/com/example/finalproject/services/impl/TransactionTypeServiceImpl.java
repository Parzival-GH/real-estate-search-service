package com.example.finalproject.services.impl;

import com.example.finalproject.models.TransactionType;
import com.example.finalproject.repositories.TransactionTypeRepo;
import com.example.finalproject.services.TransactionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionTypeServiceImpl implements TransactionTypeService {
    private final TransactionTypeRepo transactionTypeRepo;

    public TransactionTypeServiceImpl(TransactionTypeRepo transactionTypeRepo) {
        this.transactionTypeRepo = transactionTypeRepo;
    }

    @Override
    public List<TransactionType> getAllTransactionType() {
        return transactionTypeRepo.findAll();
    }

    @Override
    public TransactionType getReferenceById(Integer id) {
        return transactionTypeRepo.getReferenceById(id);
    }
}
