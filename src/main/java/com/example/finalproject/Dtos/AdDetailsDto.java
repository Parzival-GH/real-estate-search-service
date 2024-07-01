package com.example.finalproject.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AdDetailsDto(
        @JsonProperty("floor") Integer floor,
        @JsonProperty("apartment_area") Integer apartmentArea,
        @JsonProperty("year_of_construction") String yearOfConstruction,
        @JsonProperty("price") double price,
        @JsonProperty("currency") Integer currency_id,
        @JsonProperty("exchange") Integer exchange_id,
        @JsonProperty("heating") Integer heating_id,
        @JsonProperty("installment") Integer installment_id,
        @JsonProperty("mortgage") Integer mortgage_id,
        @JsonProperty("price_type") Integer price_type_id,
        @JsonProperty("property_type") Integer property_type_id,
        @JsonProperty("room_count") Integer room_count_id,
        @JsonProperty("series") Integer series_id,
        @JsonProperty("state") Integer state_id,
        @JsonProperty("transaction_type") Integer transaction_type_id,
        @JsonProperty("type_of_structure") Integer type_of_structure_id,
        @JsonProperty("location") Integer location_id,
        @JsonProperty("street_name") String street_name,
        @JsonProperty("house_number") String house_number
){}
