package com.dev.realestate.chun.deal.controller;

import com.dev.realestate.chun.deal.dto.GraphDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/deal/rent")
public class RentController  implements DealTypeController{

    @Override
    @GetMapping(value = "/city/{city}")
    public List<? extends GraphDto> findByCity(@PathVariable String city) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/date/{date}")
    public List<? extends GraphDto> findByCityAndDate(@PathVariable String city, @PathVariable String date) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/from/{from}/to/{to}")
    public List<? extends GraphDto> findByCityAndDate(@PathVariable String city, @PathVariable String from, @PathVariable String to) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/district/{district}")
    public List<? extends GraphDto> findByCityAndDistrict(@PathVariable String city, @PathVariable String district) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/district/{district}/date/{date}")
    public List<? extends GraphDto> findByCityAndDistrictAndDate(@PathVariable String city, @PathVariable String district, @PathVariable String date) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/district/{district}/from/{from}/to/{to}")
    public List<? extends GraphDto> findByCityAndDistrictAndDate(@PathVariable String city, @PathVariable String district, @PathVariable String from, @PathVariable String to) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/district/{district}/town/{town}")
    public List<? extends GraphDto> findByCityAndDistrictAndTown(@PathVariable String city, @PathVariable String district, @PathVariable String town) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/district/{district}/town/{town}/date/{date}")
    public List<? extends GraphDto> findByCityAndDistrictAndTownAndDate(@PathVariable String city, @PathVariable String district, @PathVariable String town, @PathVariable String date) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/district/{district}/town/{town}/from/{from}/to/{to}")
    public List<? extends GraphDto> findByCityAndDistrictAndTownAndDate(@PathVariable String city, @PathVariable String district, @PathVariable String town, @PathVariable String from, @PathVariable String to) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/town/{town}")
    public List<? extends GraphDto> findByCityAndTown(@PathVariable String city, @PathVariable String town) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/town/{town}/date/{date}")
    public List<? extends GraphDto> findByCityAndTownAndDate(@PathVariable String city, @PathVariable String town, @PathVariable String date) {
        return null;
    }

    @Override
    @GetMapping(value = "/city/{city}/town/{town}/from/{from}/to/{to}")
    public List<? extends GraphDto> findByCityAndTownAndDate(@PathVariable String city, @PathVariable String town, @PathVariable String from, @PathVariable String to) {
        return null;
    }
}
