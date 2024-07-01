package com.example.finalproject.repositories;

import com.example.finalproject.models.RoomCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomCountRepo extends JpaRepository<RoomCount, Integer> {
    List<RoomCount> findAll();
}
