package com.example.finalproject.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ad_details")
public class AdDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer floor;
    Integer apartmentArea;
    String yearOfConstruction;
    double price;
    String streetName;
    String houseNumber;
    double totalCostInSoms;
    double totalCostInDollars;
    boolean active;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    Currency currency;

    @ManyToOne
    @JoinColumn(name = "exchange_id")
    Exchange exchange;

    @ManyToOne
    @JoinColumn(name = "heating_id")
    Heating heating;

    @ManyToOne
    @JoinColumn(name = "installment_id")
    Installment installment;

    @ManyToOne
    @JoinColumn(name = "location_id")
    Location location;

    @ManyToOne
    @JoinColumn(name = "mortgage_id")
    Mortgage mortgage;

    @ManyToOne
    @JoinColumn(name = "room_count_id")
    RoomCount roomCount;

    @ManyToOne
    @JoinColumn(name = "series_id")
    Series series;

    @ManyToOne
    @JoinColumn(name = "state_id")
    State state;

    @ManyToOne
    @JoinColumn(name = "transaction_type_id")
    TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "type_of_structure_id")
    TypeOfStructure typeOfStructure;

    @ManyToOne
    @JoinColumn(name = "price_type_id")
    PriceType priceType;

    @ManyToOne
    @JoinColumn(name = "property_type_id")
    PropertyType propertyType;
}
