package com.example.finalproject.controllers;

import com.example.finalproject.Dtos.AdDetailsDto;
import com.example.finalproject.Dtos.AdDetailsResponseDto;
import com.example.finalproject.models.*;
import com.example.finalproject.services.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AdDetailsController {
    private final TransactionTypeService transactionTypeService;
    private final CurrencyService currencyService;
    private final ExchangeService exchangeService;
    private final HeatingService heatingService;
    private final InstallmentService installmentService;
    private final MortgageService mortgageService;
    private final RoomCountService roomCountService;
    private final SeriesService seriesService;
    private final StateService stateService;
    private final TypeOfStructureService typeOfStructureService;
    private final PropertyTypeService propertyTypeService;
    private final PriceTypeService priceTypeService;
    private final AdDetailsService adDetailsService;

    public AdDetailsController(TransactionTypeService transactionTypeService,
                               CurrencyService currencyService,
                               ExchangeService exchangeService,
                               HeatingService heatingService,
                               InstallmentService installmentService,
                               MortgageService mortgageService,
                               RoomCountService roomCountService,
                               SeriesService seriesService,
                               StateService stateService,
                               TypeOfStructureService typeOfStructureService,
                               PropertyTypeService propertyTypeService,
                               PriceTypeService priceTypeService,
                               AdDetailsService adDetailsService) {
        this.transactionTypeService = transactionTypeService;
        this.currencyService = currencyService;
        this.exchangeService = exchangeService;
        this.heatingService = heatingService;
        this.installmentService = installmentService;
        this.mortgageService = mortgageService;
        this.roomCountService = roomCountService;
        this.seriesService = seriesService;
        this.stateService = stateService;
        this.typeOfStructureService = typeOfStructureService;
        this.propertyTypeService = propertyTypeService;
        this.priceTypeService = priceTypeService;
        this.adDetailsService = adDetailsService;
    }

    @GetMapping("/get-all-transaction-type")
    ResponseEntity<List<TransactionType>> getAllTransactionType(){
        return ResponseEntity.ok(transactionTypeService.getAllTransactionType());
    }

    @GetMapping("/get-currency-type")
    ResponseEntity<List<Currency>> getCurrency(){
        return ResponseEntity.ok(currencyService.getAllCurrency());
    }

    @GetMapping("/get-exchange-type")
    ResponseEntity<List<Exchange>> getAllExchange(){
        return ResponseEntity.ok(exchangeService.getAllExchange());
    }

    @GetMapping("/get-heating-type")
    ResponseEntity<List<Heating>> getHeatingType(){
        return ResponseEntity.ok(heatingService.getAllHeating());
    }

    @GetMapping("/get-installment-type")
    ResponseEntity<List<Installment>> getInstallmentType(){
        return ResponseEntity.ok(installmentService.getAllInstallment());
    }

    @GetMapping("/get-mortgage-type")
    ResponseEntity<List<Mortgage>> getMortgageType(){
        return ResponseEntity.ok(mortgageService.getAllMortgage());
    }

    @GetMapping("/get-room-num")
    ResponseEntity<List<RoomCount>> getRoomNum(){
        return ResponseEntity.ok(roomCountService.getAllNumberOfRoom());
    }

    @GetMapping("/get-series-type")
    ResponseEntity<List<Series>> getSeriesType(){
        return ResponseEntity.ok(seriesService.getAllSeries());
    }

    @GetMapping("/get-state-type")
    ResponseEntity<List<State>> getStateType(){
        return ResponseEntity.ok(stateService.getAllState());
    }

    @GetMapping("/get-all-type-of-structure")
    ResponseEntity<List<TypeOfStructure>> getTypeOfStructure(){
        return ResponseEntity.ok(typeOfStructureService.getAllTypeOfStructure());
    }

    @GetMapping("/get-all-property-type")
    ResponseEntity<List<PropertyType>> getPropertyType(){
        return ResponseEntity.ok(propertyTypeService.getAllPropertyType());
    }

    @GetMapping("/get-price-type")
    ResponseEntity<List<PriceType>> getPriceType(){
        return ResponseEntity.ok(priceTypeService.getAllPriceType());
    }


    @PostMapping("/create-ad-details")
    ResponseEntity<String> createOurProperty(@RequestBody List<AdDetailsDto> adDetailsDtoList){
        for (AdDetailsDto adDetailsDto : adDetailsDtoList) {
            adDetailsService.createAdDetails(adDetailsDto);
        }
        return ResponseEntity.ok("All ads created successfully");
    }


    @GetMapping("get-all-our-property-dto")
    ResponseEntity<List<Map<String, Object>>> getAllOurPropertyResponseDto(){
        return ResponseEntity.ok(adDetailsService.getAllAdDetailsResponseDto());
    }
    @GetMapping("get-ads-by-id")
    ResponseEntity<List<AdDetails>> getAdById(ArrayList<Integer> ids){
        return ResponseEntity.ok(adDetailsService.getAdsById(ids));
    }


    @GetMapping("/get-ad-details")
    public ResponseEntity<List<AdDetailsResponseDto>> getAdDetails(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "5") int pageSize,
            @RequestParam(required = false) Integer floor,
            @RequestParam(required = false) Integer apartmentArea,
            @RequestParam(required = false) String yearOfConstruction,
            @RequestParam(required = false) Double price,
            @RequestParam(required = false) String currency,
            @RequestParam(required = false) String exchange,
            @RequestParam(required = false) String heating,
            @RequestParam(required = false) String installment,
            @RequestParam(required = false) String mortgage,
            @RequestParam(required = false) String priceType,
            @RequestParam(required = false) String propertyType,
            @RequestParam(required = false) String roomCount,
            @RequestParam(required = false) String series,
            @RequestParam(required = false) String state,
            @RequestParam String transactionType,
            @RequestParam(required = false) String typeOfStructure,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String region,
            @RequestParam(required = false) String settlement,
            @RequestParam(required = false) String district,
            @RequestParam(required = false) String streetName,
            @RequestParam(required = false) String houseNumber

    )
    {
        List<AdDetails> adDetails = adDetailsService.getAllAdDetailsByParameters(
                id, page, pageSize, floor, apartmentArea, yearOfConstruction, price, streetName, houseNumber, currency, exchange,
                heating, installment, mortgage, priceType, propertyType, roomCount, series, state, transactionType,
                typeOfStructure, country, region, settlement, district);
        List<AdDetailsResponseDto> adDetailsResponseDtos = adDetailsService.getALlAdDetailMapper(adDetails);
        return ResponseEntity.ok(adDetailsResponseDtos);
    }


}
