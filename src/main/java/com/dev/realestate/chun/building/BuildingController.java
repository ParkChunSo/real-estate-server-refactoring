package com.dev.realestate.chun.building;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// 빌딩의 정보
@RestController("/building")
public class BuildingController {
    // 주소를 통해 해당 매물 평당 평균가격(현시점)
    @GetMapping("/py-price/city/{city}/district/{district}/town/{town}/name/{name}")
    public Integer getPyPriceByAddress(@PathVariable String city, @PathVariable String district, @PathVariable String town, @PathVariable String name){
        return null;
    }

}