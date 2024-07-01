package com.example.finalproject.services.impl;

import com.example.finalproject.models.PropertyType;
import com.example.finalproject.repositories.PropertyTypeRepo;
import com.example.finalproject.services.PropertyTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService {
    private final PropertyTypeRepo propertyTypeRepo;

    public PropertyTypeServiceImpl(PropertyTypeRepo propertyTypeRepo) {
        this.propertyTypeRepo = propertyTypeRepo;
    }

    @Override
    public List<PropertyType> getAllPropertyType() {
        return propertyTypeRepo.findAll();
    }

    @Override
    public PropertyType getReferenceById(Integer id) {
        return propertyTypeRepo.getReferenceById(id);
    }
}
