package com.example.finalproject.services;

import com.example.finalproject.models.State;
import com.example.finalproject.repositories.StateRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StateService {
    List<State> getAllState();
    State getReferenceById(Integer id);
}

