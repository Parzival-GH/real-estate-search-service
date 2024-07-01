package com.example.finalproject.repositories;

import com.example.finalproject.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {
    List<Location> findByLocationId(Integer id);
}
