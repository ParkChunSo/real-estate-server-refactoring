package com.dev.realestate.chun.deal.repository.apartment;

import com.dev.realestate.chun.deal.dao.DealDao;
import com.dev.realestate.chun.entitys.AptTransactionHistory;
import com.dev.realestate.chun.enums.DealType;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static com.dev.realestate.chun.entitys.QApartment.apartment;
import static com.dev.realestate.chun.entitys.QAptTransactionHistory.aptTransactionHistory;

@Slf4j
@Component
public class AptTransactionHistoryRepoCustomImpl extends QuerydslRepositorySupport implements AptTransactionHistoryRepoCustom {

    @PersistenceContext
    private EntityManager entityManager;

    public AptTransactionHistoryRepoCustomImpl() {
        super(AptTransactionHistory.class);
    }

    private JPAQuery<DealDao> getBasicQuery(DealType type){
        JPAQuery<DealDao> jpaQuery = new JPAQuery<>(entityManager);
        return jpaQuery.select(Projections.constructor(DealDao.class, aptTransactionHistory.pyPrice, aptTransactionHistory.date))
                .from(aptTransactionHistory)
                .join(aptTransactionHistory.apartment, apartment)
                .where(aptTransactionHistory.type.eq(type));
    }

    @Override
    public List<DealDao> findByDealTypeAndCity(DealType type, String city){
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrict(DealType type, String city, String district) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(apartment.district.eq(district))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTown(DealType type, String city, String district, String town) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(apartment.district.eq(district))
                .where(apartment.town.eq(town))
                .groupBy(aptTransactionHistory.date)
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate date) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(aptTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate date) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(apartment.district.eq(district))
                .where(aptTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate date) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(apartment.district.eq(district))
                .where(apartment.town.eq(town))
                .where(aptTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(aptTransactionHistory.date.between(from, to))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(apartment.district.eq(district))
                .where(aptTransactionHistory.date.between(from, to))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(apartment.city.eq(city))
                .where(apartment.district.eq(district))
                .where(apartment.town.eq(town))
                .where(aptTransactionHistory.date.between(from, to))
                .fetch();
    }
}
