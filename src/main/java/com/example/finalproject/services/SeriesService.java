package com.example.finalproject.services;

import com.example.finalproject.models.Series;
import com.example.finalproject.repositories.SeriesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeriesService {
    List<Series> getAllSeries();
    Series getReferenceById(Integer id);
}
