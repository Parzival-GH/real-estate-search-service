package com.example.finalproject.services;

import com.example.finalproject.models.RoomCount;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.util.List;

@Service
public interface RoomCountService {
    List<RoomCount> getAllNumberOfRoom();
    RoomCount getReferenceById(Integer id);
}
