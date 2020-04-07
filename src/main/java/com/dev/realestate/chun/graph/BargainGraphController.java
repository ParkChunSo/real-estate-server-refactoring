package com.dev.realestate.chun.graph;

import com.dev.realestate.chun.graph.dto.GraphDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/graph/bargain")
public class BargainGraphController implements GraphController{
    @Override
    @GetMapping(value = "/city/{city}")
    public List<GraphDto> onlyCity(@PathVariable String city) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndDate(String city, String date) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndDistrict(String city, String district) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndDistrictAndDate(String city, String district, String date) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndDistrictAndNeighborhood(String city, String district, String neighborhood) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndDistrictAndNeighborhoodAndDate(String city, String district, String neighborhood, String date) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndNeighborhood(String city, String neighborhood) {
        return null;
    }

    @Override
    public List<GraphDto> cityAndNeighborhoodAndDate(String city, String neighborhood, String date) {
        return null;
    }
}
