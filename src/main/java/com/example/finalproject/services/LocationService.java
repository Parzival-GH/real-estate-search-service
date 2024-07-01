package com.example.finalproject.services;

import com.example.finalproject.Dtos.LocationDto;
import com.example.finalproject.models.Location;
import com.example.finalproject.repositories.LocationRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public interface LocationService {
    List<LocationDto> getAllLocation(Integer id);
    Location getReferenceById(Integer id);
}
