package com.example.finalproject.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AdDetailsResponseDto(
        @JsonProperty("transaction_type")
        String transaction_type_id,
        @JsonProperty("property_type")
        String property_type_id,
        @JsonProperty("room_count")
        String room_count_id,
        @JsonProperty("apartment_area")
        int apartment_area,
        @JsonProperty("series")
        String series_id,
        @JsonProperty("type_of_structure")
        String type_of_structure_id,
        @JsonProperty("year_of_construction")
        String year_of_construction,
        @JsonProperty("floor")
        Integer floor,
        @JsonProperty("heating")
        String heating_id,
        @JsonProperty("state")
        String state_id,
        @JsonProperty("country")
        String country_id,
        @JsonProperty("region")
        String region_id,
        @JsonProperty("settlement")
        String settlement_id,
        @JsonProperty("district")
        String district_id,
        @JsonProperty("street_name")
        String street_name,
        @JsonProperty("house_number")
        String house_number,
        @JsonProperty("currency")
        String currencies_id,
        @JsonProperty("price_type")
        String price_types_id,
        @JsonProperty("price")
        Double price,
        @JsonProperty("installment")
        String installment_id,
        @JsonProperty("mortgage")
        String mortgage_id,
        @JsonProperty("exchange")
        String exchange_id
) {
}
