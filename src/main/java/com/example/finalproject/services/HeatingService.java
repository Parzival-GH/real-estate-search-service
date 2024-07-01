package com.example.finalproject.services;

import com.example.finalproject.models.Heating;
import com.example.finalproject.repositories.HeatingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HeatingService {
    List<Heating> getAllHeating();
    Heating getReferenceById(Integer id);
}
