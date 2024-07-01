package com.example.finalproject.services.impl;

import com.example.finalproject.models.Installment;
import com.example.finalproject.repositories.InstallmentRepo;
import com.example.finalproject.services.InstallmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallmentServiceImpl implements InstallmentService {

    private final InstallmentRepo installmentRepo;

    public InstallmentServiceImpl(InstallmentRepo installmentRepo) {
        this.installmentRepo = installmentRepo;
    }

    @Override
    public List<Installment> getAllInstallment() {
        return installmentRepo.findAll();
    }

    @Override
    public Installment getReferenceById(Integer id) {
        return installmentRepo.getReferenceById(id);
    }
}
