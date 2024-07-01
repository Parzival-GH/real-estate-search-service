package com.example.finalproject.services;

import com.example.finalproject.models.PropertyType;
import com.example.finalproject.repositories.PropertyTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropertyTypeService {
    List<PropertyType> getAllPropertyType();
    PropertyType getReferenceById(Integer id);
}
