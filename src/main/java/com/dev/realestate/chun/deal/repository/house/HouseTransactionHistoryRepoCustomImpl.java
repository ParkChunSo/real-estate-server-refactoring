package com.dev.realestate.chun.deal.repository.house;

import com.dev.realestate.chun.deal.dao.DealDao;
import com.dev.realestate.chun.entitys.HouseTransactionHistory;
import com.dev.realestate.chun.enums.DealType;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

import static com.dev.realestate.chun.entitys.QHouse.house;
import static com.dev.realestate.chun.entitys.QHouseTransactionHistory.houseTransactionHistory;
@Slf4j
@Component
public class HouseTransactionHistoryRepoCustomImpl extends QuerydslRepositorySupport implements HouseTransactionHistoryRepoCustom  {
    @PersistenceContext
    private EntityManager entityManager;

    public HouseTransactionHistoryRepoCustomImpl() {
        super(HouseTransactionHistory.class);
    }

    private JPAQuery<DealDao> getBasicQuery(DealType type){
        JPAQuery<DealDao> jpaQuery = new JPAQuery<>(entityManager);
        return jpaQuery.select(Projections.constructor(DealDao.class, houseTransactionHistory.pyPrice, houseTransactionHistory.date))
                .from(houseTransactionHistory)
                .join(houseTransactionHistory.house, house)
                .where(houseTransactionHistory.type.eq(type));
    }

    @Override
    public List<DealDao> findByDealTypeAndCity(DealType type, String city){
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrict(DealType type, String city, String district) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(house.district.eq(district))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTown(DealType type, String city, String district, String town) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(house.district.eq(district))
                .where(house.town.eq(town))
                .groupBy(houseTransactionHistory.date)
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate date) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(houseTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate date) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(house.district.eq(district))
                .where(houseTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate date) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(house.district.eq(district))
                .where(house.town.eq(town))
                .where(houseTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(houseTransactionHistory.date.between(from, to))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(house.district.eq(district))
                .where(houseTransactionHistory.date.between(from, to))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(house.city.eq(city))
                .where(house.district.eq(district))
                .where(house.town.eq(town))
                .where(houseTransactionHistory.date.between(from, to))
                .fetch();
    }
}
