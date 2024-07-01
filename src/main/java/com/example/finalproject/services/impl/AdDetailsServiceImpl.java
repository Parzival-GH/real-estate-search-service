package com.example.finalproject.services.impl;

import com.example.finalproject.Dtos.AdDetailsDto;
import com.example.finalproject.Dtos.AdDetailsResponseDto;
import com.example.finalproject.models.*;
import com.example.finalproject.repositories.AdDetailsRepo;
import com.example.finalproject.services.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AdDetailsServiceImpl implements AdDetailsService {

    private final AdDetailsRepo adDetailsRepo;
    private final TransactionTypeService transactionTypeService;
    private final PropertyTypeService propertyTypeService;
    private final RoomCountService roomCountService;
    private final SeriesService seriesService;
    private final TypeOfStructureService typeOfStructureService;
    private final HeatingService heatingService;
    private final StateService stateService;
    private final LocationService locationService;
    private final CurrencyService currencyService;
    private final PriceTypeService priceTypeService;
    private final MortgageService mortgageService;
    private final InstallmentService installmentService;
    private final ExchangeService exchangeService;


    public AdDetailsServiceImpl(AdDetailsRepo ourPropertyRepo,
                                TransactionTypeService transactionTypeService,
                                PropertyTypeService propertyTypeService,
                                RoomCountService roomCountService,
                                SeriesService seriesService,
                                TypeOfStructureService typeOfStructureService,
                                HeatingService heatingService,
                                StateService stateService,
                                LocationService locationService,
                                CurrencyService currencyService,
                                PriceTypeService priceTypeService,
                                MortgageService mortgageService,
                                InstallmentService installmentService,
                                ExchangeService exchangeService) {
        this.adDetailsRepo = ourPropertyRepo;
        this.transactionTypeService = transactionTypeService;
        this.propertyTypeService = propertyTypeService;
        this.roomCountService = roomCountService;
        this.seriesService = seriesService;
        this.typeOfStructureService = typeOfStructureService;
        this.heatingService = heatingService;
        this.stateService = stateService;
        this.locationService = locationService;
        this.currencyService = currencyService;
        this.priceTypeService = priceTypeService;
        this.mortgageService = mortgageService;
        this.installmentService = installmentService;
        this.exchangeService = exchangeService;
    }



    @Override
    public void createAdDetails(AdDetailsDto adDetailsDto) {

        if (adDetailsDto.transaction_type_id() == null) {
            throw new IllegalArgumentException("Transaction type ID must not be null");
        }
        if (adDetailsDto.property_type_id() == null) {
            throw new IllegalArgumentException("Property type ID must not be null");
        }
        if (adDetailsDto.room_count_id() == null) {
            throw new IllegalArgumentException("Room count ID must not be null");
        }
        if (adDetailsDto.series_id() == null) {
            throw new IllegalArgumentException("Series ID must not be null");
        }
        if (adDetailsDto.type_of_structure_id() == null) {
            throw new IllegalArgumentException("Type of structure ID must not be null");
        }
        if (adDetailsDto.heating_id() == null) {
            throw new IllegalArgumentException("Heating ID must not be null");
        }
        if (adDetailsDto.state_id() == null) {
            throw new IllegalArgumentException("State ID must not be null");
        }
        if (adDetailsDto.location_id() == null) {
            throw new IllegalArgumentException("Location ID must not be null");
        }
        if (adDetailsDto.currency_id() == null) {
            throw new IllegalArgumentException("Currency ID must not be null");
        }
        if (adDetailsDto.price_type_id() == null) {
            throw new IllegalArgumentException("Price type ID must not be null");
        }
        if (adDetailsDto.installment_id() == null) {
            throw new IllegalArgumentException("Installment ID must not be null");
        }
        if (adDetailsDto.mortgage_id() == null) {
            throw new IllegalArgumentException("Mortgage ID must not be null");
        }
        if (adDetailsDto.exchange_id() == null) {
            throw new IllegalArgumentException("Exchange ID must not be null");
        }

        TransactionType transactionType = transactionTypeService.getReferenceById(adDetailsDto.transaction_type_id());
        PropertyType propertyType = propertyTypeService.getReferenceById(adDetailsDto.property_type_id());
        RoomCount roomCount = roomCountService.getReferenceById(adDetailsDto.room_count_id());
        Series series = seriesService.getReferenceById(adDetailsDto.series_id());
        TypeOfStructure typeOfStructure = typeOfStructureService.getReferenceById(adDetailsDto.type_of_structure_id());
        Heating heating = heatingService.getReferenceById(adDetailsDto.heating_id());
        State state = stateService.getReferenceById(adDetailsDto.state_id());
        Location location = locationService.getReferenceById(adDetailsDto.location_id());
        Currency currency = currencyService.getReferenceById(adDetailsDto.currency_id());
        PriceType priceType = priceTypeService.getReferenceById(adDetailsDto.price_type_id());
        Installment installment = installmentService.getReferenceById(adDetailsDto.installment_id());
        Mortgage mortgage = mortgageService.getReferenceById(adDetailsDto.mortgage_id());
        Exchange exchange = exchangeService.getReferenceById(adDetailsDto.exchange_id());

       {

            AdDetails adDetails = new AdDetails();
            adDetails.setTransactionType(transactionType);
            adDetails.setPropertyType(propertyType);
            adDetails.setRoomCount(roomCount);
            adDetails.setApartmentArea(adDetailsDto.apartmentArea());
            adDetails.setSeries(series);
            adDetails.setTypeOfStructure(typeOfStructure);
            adDetails.setYearOfConstruction(adDetailsDto.yearOfConstruction());
            adDetails.setFloor(adDetailsDto.floor());
            adDetails.setHeating(heating);
            adDetails.setState(state);
            adDetails.setLocation(location);
            adDetails.setStreetName(adDetailsDto.street_name());
            adDetails.setHouseNumber(adDetailsDto.house_number());
            adDetails.setCurrency(currency);
            adDetails.setPriceType(priceType);
            adDetails.setPrice(adDetailsDto.price());
            adDetails.setInstallment(installment);
            adDetails.setMortgage(mortgage);
            adDetails.setExchange(exchange);
            adDetails.setActive(true);
            adDetailsRepo.save(adDetails);
        }
    }

    @Override
    public List<AdDetailsResponseDto> getALlAdDetailMapper(List<AdDetails> adDetails) {
        return adDetails.stream()
                .map(adDetail -> new AdDetailsResponseDto(
                        adDetail.getTransactionType().getName(),
                        adDetail.getPropertyType().getName(),
                        adDetail.getRoomCount().getRoomCount(),
                        adDetail.getApartmentArea(),
                        adDetail.getSeries().getName(),
                        adDetail.getTypeOfStructure().getName(),
                        adDetail.getYearOfConstruction(),
                        adDetail.getFloor(),
                        adDetail.getHeating().getName(),
                        adDetail.getState().getName(),
                        adDetailsRepo.getCountry(adDetail.getLocation().getName()),
                        adDetailsRepo.getRegion(adDetail.getLocation().getName()),
                        adDetail.getLocation().getName(),
                        adDetail.getLocation().getName(),
                        adDetail.getStreetName(),
                        adDetail.getHouseNumber(),
                        adDetail.getCurrency().getName(),
                        adDetail.getPriceType().getName(),
                        adDetail.getPrice(),
                        adDetail.getMortgage().getName(),
                        adDetail.getInstallment().getName(),
                        adDetail.getExchange().getName()
                )).toList();
    }


    @Override
    public List<Map<String, Object>> getAllAdDetailsResponseDto() {
        return adDetailsRepo.findAllAdDetails();
    }

    @Override
    public List<AdDetails> getAdsById(Iterable<Integer> ids) {
        return adDetailsRepo.findAllById(ids);
    }


    @Override
    public List<AdDetails> getAllAdDetailsByParameters(
            Integer id, int page, int pageSize, Integer floor, Integer apartmentArea, String yearOfConstruction, Double price,
            String streetName, String houseNumber, String currency, String exchange,
            String heating, String installment, String mortgage, String priceType,
            String propertyType, String roomCount, String series, String state, String transactionType,
            String typeOfStructure, String country, String region, String settlement, String district)
    {
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);
        Specification<AdDetails> parameters = ((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = buildPredicates(floor, apartmentArea, yearOfConstruction, price,
                    streetName, houseNumber, currency, exchange, heating, installment, mortgage, priceType,
                    propertyType, roomCount, series, state, transactionType, typeOfStructure, country, region,
                    settlement, district, root, criteriaBuilder);
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
        Page<AdDetails> pages = adDetailsRepo.findAll(parameters,pageRequest);
        return pages.getContent();
    }

    private List<Predicate> buildPredicates(
            Integer floor, Integer apartmentArea, String yearOfConstruction, Double price,
            String streetName, String houseNumber, String currency, String exchange,
            String heating, String installment, String mortgage, String priceType,
            String propertyType, String roomCount, String series, String state, String transactionType,
            String typeOfStructure, String country, String  region, String settlement, String district,
            Root<AdDetails> root, CriteriaBuilder criteriaBuilder) {

        List<Predicate> predicates = new ArrayList<>();

        if (floor != null) {
            predicates.add(criteriaBuilder.equal(root.get("floor"), floor));
        }
        if (apartmentArea != null) {
            predicates.add(criteriaBuilder.equal(root.get("apartmentArea"), apartmentArea));
        }
        if (yearOfConstruction != null) {
            predicates.add(criteriaBuilder.equal(root.get("yearOfConstruction"), yearOfConstruction));
        }
        if (price != null) {
            predicates.add(criteriaBuilder.equal(root.get("price"), price));
        }
        if (streetName != null) {
            predicates.add(criteriaBuilder.equal(root.get("streetName"), streetName));
        }
        if (houseNumber != null) {
            predicates.add(criteriaBuilder.equal(root.get("houseNumber"), houseNumber));
        }
        if (currency != null) {
            predicates.add(criteriaBuilder.equal(root.get("currency").get("name"), currency));
        }
        if (exchange != null) {
            predicates.add(criteriaBuilder.equal(root.get("exchange").get("name"), exchange));
        }
        if (heating != null) {
            predicates.add(criteriaBuilder.equal(root.get("heating").get("name"), heating));
        }
        if (installment != null) {
            predicates.add(criteriaBuilder.equal(root.get("installment").get("name"), installment));
        }
        if (mortgage != null) {
            predicates.add(criteriaBuilder.equal(root.get("mortgage").get("name"), mortgage));
        }
        if (priceType != null) {
            predicates.add(criteriaBuilder.equal(root.get("priceType").get("name"), priceType));
        }
        if (propertyType != null) {
            predicates.add(criteriaBuilder.equal(root.get("propertyType").get("name"), propertyType));
        }
        if (roomCount != null) {
            predicates.add(criteriaBuilder.equal(root.get("roomCount").get("roomCount"), roomCount));
        }
        if (series != null) {
            predicates.add(criteriaBuilder.equal(root.get("series").get("name"), series));
        }
        if (state != null) {
            predicates.add(criteriaBuilder.equal(root.get("state").get("name"), state));
        }
        if (transactionType != null) {
            predicates.add(criteriaBuilder.equal(root.get("transactionType").get("name"), transactionType));
        }
        if (typeOfStructure != null) {
            predicates.add(criteriaBuilder.equal(root.get("typeOfStructure").get("name"), typeOfStructure));
        }
        if (country != null) {
            predicates.add(criteriaBuilder.equal(root.get("location").get("country").get("name"), country));
        }
        if (region != null) {
            predicates.add(criteriaBuilder.equal(root.get("location").get("region").get("name"), region));
        }
        if (settlement != null) {
            predicates.add(criteriaBuilder.equal(root.get("location").get("settlement").get("name"), settlement));
        }
        if (district != null) {
            Join<AdDetails, Location> join1 = root.join("location");
            predicates.add(criteriaBuilder.equal((join1.get("name")), district));
        }

        return predicates;
    }


}
