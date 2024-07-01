package com.example.finalproject.repositories;

import com.example.finalproject.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdDetailsRepo extends JpaRepository<AdDetails, Integer>, JpaSpecificationExecutor<AdDetails> {
    @Query("SELECT " +
            "   t2.name AS transaction_type, " +
            "   p3.name AS property_type, " +
            "   n4.roomCount AS room_count, " +
            "   o1.apartmentArea AS apartment_area, " +
            "   s5.name AS series, " +
            "   t6.name AS type_of_structure, " +
            "   o1.yearOfConstruction AS year_of_construction, " +
            "   o1.floor AS floor, " +
            "   h7.name AS heating_type, " +
            "   c8.name AS state, " +
            "   ls1.name AS country, " +
            "   ls2.name AS region, " +
            "   ls3.name AS city, " +
            "   ls4.name AS district, " +
            "   o1.streetName AS street_name, " +
            "   o1.houseNumber AS house_number, " +
            "   c12.name AS currency_type, " +
            "   p13.name AS installment, " +
            "   o1.price AS price, " +
            "   m9.name AS mortgage, " +
            "   m10.name AS exchange_type " +
            "FROM AdDetails o1 " +
            "JOIN o1.transactionType t2 " +
            "JOIN o1.propertyType p3 " +
            "JOIN o1.roomCount n4 " +
            "JOIN o1.series s5 " +
            "JOIN o1.typeOfStructure t6 " +
            "JOIN o1.heating h7 " +
            "JOIN o1.state c8 " +
            "JOIN o1.installment m9 " +
            "JOIN o1.mortgage m10 " +
            "JOIN o1.exchange p13 " +
            "JOIN o1.currency c12 " +
            "JOIN o1.location ls1 " +
            "JOIN ls1.location ls2 " +
            "JOIN ls2.location ls3 " +
            "JOIN ls3.location ls4 ")
    List<Map<String, Object>> findAllAdDetails();


    @Query(value = """
    SELECT l3.name
    FROM location l3
    WHERE l3.id = (
        SELECT l2.location_id
        FROM location l2
        WHERE l2.id = (
            SELECT l1.location_id
            FROM location l1
            WHERE l1.name = :name
        )
    )""", nativeQuery = true)
    String getCountry(String name);

    @Query(value = """
        SELECT l2.name
        FROM location l2
        WHERE l2.id = (
            SELECT l1.location_id
            FROM location l1
            WHERE l1.name = :name
        )""", nativeQuery = true)
    String getRegion(String name);

    List<AdDetails> findAllById(Iterable<Integer> ids);
}
