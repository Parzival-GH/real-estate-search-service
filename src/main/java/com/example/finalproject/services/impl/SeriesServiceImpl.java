package com.example.finalproject.services.impl;

import com.example.finalproject.models.Series;
import com.example.finalproject.repositories.SeriesRepo;
import com.example.finalproject.services.SeriesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiceImpl implements SeriesService {
    private final SeriesRepo seriesRepo;

    public SeriesServiceImpl(SeriesRepo seriesRepo) {
        this.seriesRepo = seriesRepo;
    }

    @Override
    public List<Series> getAllSeries() {
        return seriesRepo.findAll();
    }

    @Override
    public Series getReferenceById(Integer id) {
        return seriesRepo.getReferenceById(id);
    }
}
