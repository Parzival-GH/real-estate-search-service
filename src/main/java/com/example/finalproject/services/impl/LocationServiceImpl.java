package com.example.finalproject.services.impl;

import com.example.finalproject.Dtos.LocationDto;
import com.example.finalproject.models.Location;
import com.example.finalproject.repositories.LocationRepo;
import com.example.finalproject.services.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepo locationRepo;

    public LocationServiceImpl(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    @Override
    public List<LocationDto> getAllLocation(Integer id) {
        return locationRepo.findByLocationId(id)
                .stream()
                .map(location -> new LocationDto(location.getId(), location.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Location getReferenceById(Integer id) {
        return locationRepo.getReferenceById(id);
    }
}
