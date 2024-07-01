package com.example.finalproject.services.impl;

import com.example.finalproject.models.TypeOfStructure;
import com.example.finalproject.repositories.TypeOfStructureRepo;
import com.example.finalproject.services.TypeOfStructureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfStructureServiceImpl implements TypeOfStructureService {
    private final TypeOfStructureRepo typeOfStructureRepo;

    public TypeOfStructureServiceImpl(TypeOfStructureRepo typeOfStructureRepo) {
        this.typeOfStructureRepo = typeOfStructureRepo;
    }

    @Override
    public List<TypeOfStructure> getAllTypeOfStructure() {
        return typeOfStructureRepo.findAll();
    }

    @Override
    public TypeOfStructure getReferenceById(Integer id) {
        return typeOfStructureRepo.getReferenceById(id);
    }
}
