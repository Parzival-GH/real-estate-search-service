package com.example.finalproject.services.impl;

import com.example.finalproject.models.RoomCount;
import com.example.finalproject.repositories.RoomCountRepo;
import com.example.finalproject.services.RoomCountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomCountServiceImpl implements RoomCountService {
    private final RoomCountRepo roomCountRepo;

    public RoomCountServiceImpl(RoomCountRepo roomCountRepo) {
        this.roomCountRepo = roomCountRepo;
    }

    @Override
    public List<RoomCount> getAllNumberOfRoom() {
        return roomCountRepo.findAll();
    }

    @Override
    public RoomCount getReferenceById(Integer id) {
        return roomCountRepo.getReferenceById(id);
    }
}
