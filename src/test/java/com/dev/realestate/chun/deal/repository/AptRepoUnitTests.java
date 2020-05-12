package com.dev.realestate.chun.deal.repository;

import com.dev.realestate.chun.deal.dao.DealDao;
import com.dev.realestate.chun.deal.repository.apartment.ApartmentRepo;
import com.dev.realestate.chun.deal.repository.apartment.AptTransactionHistoryRepo;
import com.dev.realestate.chun.entitys.Apartment;
import com.dev.realestate.chun.entitys.AptTransactionHistory;
import com.dev.realestate.chun.enums.DealType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootTest
public class AptRepoUnitTests {
    @Autowired
    private AptTransactionHistoryRepo repo;
    @Autowired
    private ApartmentRepo apartmentRepo;

    private final String city= "경기도";
    private final String district = "양평군";
    private final List<String> town = Arrays.asList("양평읍", "개군면", "강하면");
    private final String streetNum = "관문길";
    private final String landNum = "110-11";
    private final String aptName = "현대아파트";

    List<Apartment> apartmentList = new ArrayList<>();

    @BeforeEach
    void setUp(){
        Random random = new Random();

        for(int i = 0 ; i < 20 ; i++){
            Apartment apartment = Apartment.builder()
                                        .city(city)
                                        .district(district)
                                        .town(town.get(random.nextInt(town.size())))
                                        .streetNum(streetNum + i)
                                        .landNum(landNum + i)
                                        .aptName(aptName)
                                        .area(random.nextDouble()*10)
                                        .floor(random.nextInt(20))
                                        .constructYear(2020)
                                        .transactionHistoryList(new ArrayList<>())
                                        .build();

            for(int k = 0 ; k < 10 ; k++){
                AptTransactionHistory transactionHistory = new AptTransactionHistory();
                transactionHistory.setType(DealType.BARGAIN);
                transactionHistory.setPyPrice(random.nextDouble());
                transactionHistory.setPrice(500d);
                transactionHistory.setDate(LocalDate.now());
                transactionHistory.setApartment(apartment);
                apartment.addTransactionHistory(transactionHistory);
            }
            apartmentList.add(apartment);
        }
    }

    @Test
    void findByCity(){
        apartmentRepo.saveAll(apartmentList);
//        apartmentRepo.save(apartmentList.get(0));
        List<DealDao> list =
                repo.findByDealTypeAndCityAndDistrictAndTown(DealType.BARGAIN, "경기도", "양평군", "양평읍");

    }
}
