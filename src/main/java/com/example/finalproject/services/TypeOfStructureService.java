package com.example.finalproject.services;

import com.example.finalproject.models.TypeOfStructure;
import com.example.finalproject.repositories.TypeOfStructureRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeOfStructureService {
    List<TypeOfStructure> getAllTypeOfStructure();
    TypeOfStructure getReferenceById(Integer id);
}
