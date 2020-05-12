package com.dev.realestate.chun.deal.controller;

import com.dev.realestate.chun.deal.dto.GraphDto;

import java.util.List;

public interface DealTypeController {
    /**
     * @param city: 시, 도를 의미한다.
     * @return 시, 도 별 연평균 가격을 제공한다.
     */
    List<? extends GraphDto> findByCity(String city);

    List<? extends GraphDto> findByCityAndDate(String city, String date);

    List<? extends GraphDto> findByCityAndDate(String city, String from, String to);

    List<? extends GraphDto> findByCityAndDistrict(String city, String district);

    List<? extends GraphDto> findByCityAndDistrictAndDate(String city, String district, String date);

    List<? extends GraphDto> findByCityAndDistrictAndDate(String city, String district, String from, String to);

    List<? extends GraphDto> findByCityAndDistrictAndTown(String city, String district, String town);

    List<? extends GraphDto> findByCityAndDistrictAndTownAndDate(String city, String district, String town, String date);

    List<? extends GraphDto> findByCityAndDistrictAndTownAndDate(String city, String district, String town, String from, String to);

    /**
     *세종시같은 경우 district가 없기 때문에 city와 town으로 검색 가능하도록
     */
    List<? extends GraphDto> findByCityAndTown(String city, String town);

    List<? extends GraphDto> findByCityAndTownAndDate(String city, String town, String date);

    List<? extends GraphDto> findByCityAndTownAndDate(String city, String town, String from, String to);

}
