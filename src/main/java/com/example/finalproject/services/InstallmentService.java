package com.example.finalproject.services;

import com.example.finalproject.models.Installment;
import com.example.finalproject.models.Mortgage;
import com.example.finalproject.repositories.InstallmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstallmentService {
    List<Installment> getAllInstallment();
    Installment getReferenceById(Integer id);
}
