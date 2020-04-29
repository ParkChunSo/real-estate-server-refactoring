package com.dev.realestate.chun.deal.controller;

import com.dev.realestate.chun.deal.dto.GraphDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/deal/rent")
public class RentController  implements DealTypeController{
    @Override
    public List<? extends GraphDto> findByCity(String city) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndDate(String city, String date) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndDistrict(String city, String district) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndDistrictAndDate(String city, String district, String date) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndDistrictAndTown(String city, String district, String town) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndDistrictAndTownAndDate(String city, String district, String town, String date) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndTown(String city, String town) {
        return null;
    }

    @Override
    public List<? extends GraphDto> findByCityAndTownAndDate(String city, String town, String date) {
        return null;
    }
}
