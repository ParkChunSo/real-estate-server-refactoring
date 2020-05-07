package com.dev.realestate.chun.deal.repository.apartment;

import com.dev.realestate.chun.deal.dao.DealDao;
import com.dev.realestate.chun.enums.DealType;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AptTransactionHistoryRepoCustom {
    List<DealDao> findByDealTypeAndCity(DealType type, String city);
    List<DealDao> findByDealTypeAndCityAndDistrict(DealType type, String city, String district);
    List<DealDao> findByDealTypeAndCityAndDistrictAndTown(DealType type, String city, String district, String town);

    List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate date);
    List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate date);
    List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate date);

    List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate from, LocalDate to);
    List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate from, LocalDate to);
    List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate from, LocalDate to);
}
