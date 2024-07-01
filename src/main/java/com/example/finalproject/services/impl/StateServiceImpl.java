package com.example.finalproject.services.impl;

import com.example.finalproject.models.State;
import com.example.finalproject.repositories.StateRepo;
import com.example.finalproject.services.StateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {
    private final StateRepo stateRepo;

    public StateServiceImpl(StateRepo stateRepo) {
        this.stateRepo = stateRepo;
    }

    @Override
    public List<State> getAllState() {
        return stateRepo.findAll();
    }

    @Override
    public State getReferenceById(Integer id) {
        return stateRepo.getReferenceById(id);
    }
}
