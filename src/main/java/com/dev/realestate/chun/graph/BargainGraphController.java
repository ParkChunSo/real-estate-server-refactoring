package com.dev.realestate.chun.graph;

import com.dev.realestate.chun.graph.dto.BargainDto;
import com.dev.realestate.chun.graph.dto.GraphDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/graph/bargain")
public class BargainGraphController implements GraphController {

    @Override
    @GetMapping(value = "/city/{city}")
    public List<BargainDto> findByCity(@PathVariable String city) {
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
