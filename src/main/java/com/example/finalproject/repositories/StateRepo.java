package com.example.finalproject.repositories;

import com.example.finalproject.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepo extends JpaRepository<State, Integer> {
    List<State> findAll();
}
