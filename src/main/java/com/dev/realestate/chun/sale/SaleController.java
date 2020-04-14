package com.dev.realestate.chun.sale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sale")
public class SaleController {
    @GetMapping("/py-price/city/{city}")
    public Integer findByCity(@PathVariable String city){
        return null;
    }
}
