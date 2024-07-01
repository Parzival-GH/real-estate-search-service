package com.example.finalproject.services;

import com.example.finalproject.Dtos.AdDetailsDto;
import com.example.finalproject.Dtos.AdDetailsResponseDto;
import com.example.finalproject.models.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AdDetailsService {
    void createAdDetails(AdDetailsDto adDetailsDto);
    List<AdDetailsResponseDto> getALlAdDetailMapper(List<AdDetails> adDetails);
    List<Map<String, Object>> getAllAdDetailsResponseDto();


    List<AdDetails> getAdsById(Iterable<Integer> ids);

    List<AdDetails> getAllAdDetailsByParameters(
            Integer id, int page, int pageSize, Integer floor, Integer apartmentArea, String yearOfConstruction, Double price,
            String streetName, String houseNumber, String currency, String exchange,
            String heating, String installment, String mortgage, String priceType,
            String propertyType, String roomCount, String series, String state, String transactionType,
            String typeOfStructure, String country, String region, String settlement, String district);

}
