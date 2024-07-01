package com.example.finalproject.services.impl;

import com.example.finalproject.models.Heating;
import com.example.finalproject.repositories.HeatingRepo;
import com.example.finalproject.services.HeatingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeatingServiceImpl implements HeatingService {

    private final HeatingRepo heatingRepo;

    public HeatingServiceImpl(HeatingRepo heatingRepo) {
        this.heatingRepo = heatingRepo;
    }

    @Override
    public List<Heating> getAllHeating() {
        return heatingRepo.findAll();
    }

    @Override
    public Heating getReferenceById(Integer id) {
        return heatingRepo.getReferenceById(id);
    }
}
