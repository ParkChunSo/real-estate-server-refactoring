package com.dev.realestate.chun.deal.repository.officetel;

import com.dev.realestate.chun.deal.dao.DealDao;
import com.dev.realestate.chun.entitys.OfficetelTransactionHistory;
import com.dev.realestate.chun.enums.DealType;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.time.LocalDate;
import java.util.List;

import static com.dev.realestate.chun.entitys.QOfficetel.officetel;
import static com.dev.realestate.chun.entitys.QOfficetelTransactionHistory.officetelTransactionHistory;


@Component
public class OfficetelTransactionHistoryRepoCustomImpl extends QuerydslRepositorySupport implements OfficetelTransactionHistoryRepoCustom {
    @PersistenceContext
    private EntityManager entityManager;

    public OfficetelTransactionHistoryRepoCustomImpl() {
        super(OfficetelTransactionHistory.class);
    }

    private JPAQuery<DealDao> getBasicQuery(DealType type){
        JPAQuery<DealDao> jpaQuery = new JPAQuery<>(entityManager);
        return jpaQuery.select(Projections.constructor(DealDao.class, officetelTransactionHistory.pyPrice, officetelTransactionHistory.date))
                .from(officetelTransactionHistory)
                .join(officetelTransactionHistory.officetel, officetel)
                .where(officetelTransactionHistory.type.eq(type));
    }

    @Override
    public List<DealDao> findByDealTypeAndCity(DealType type, String city){
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrict(DealType type, String city, String district) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetel.district.eq(district))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTown(DealType type, String city, String district, String town) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetel.district.eq(district))
                .where(officetel.town.eq(town))
                .groupBy(officetelTransactionHistory.date)
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate date) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetelTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate date) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetel.district.eq(district))
                .where(officetelTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate date) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetel.district.eq(district))
                .where(officetel.town.eq(town))
                .where(officetelTransactionHistory.date.eq(date))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDate(DealType type, String city, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetelTransactionHistory.date.between(from, to))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndDate(DealType type, String city, String district, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetel.district.eq(district))
                .where(officetelTransactionHistory.date.between(from, to))
                .fetch();
    }

    @Override
    public List<DealDao> findByDealTypeAndCityAndDistrictAndTownAndDate(DealType type, String city, String district, String town, LocalDate from, LocalDate to) {
        return getBasicQuery(type)
                .where(officetel.city.eq(city))
                .where(officetel.district.eq(district))
                .where(officetel.town.eq(town))
                .where(officetelTransactionHistory.date.between(from, to))
                .fetch();
    }
}
