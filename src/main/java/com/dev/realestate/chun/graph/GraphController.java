package com.dev.realestate.chun.graph;

import com.dev.realestate.chun.graph.dto.GraphDto;

import java.util.List;

public interface GraphController {
    /**
     * @param city: 시, 도를 의미한다.
     * @return 시, 도 별 연평균 가격을 제공한다.
     */
    List<? extends GraphDto> onlyCity(String city);

    List<? extends GraphDto> cityAndDate(String city, String date);

    List<? extends GraphDto> cityAndDistrict(String city, String district);

    List<? extends GraphDto> cityAndDistrictAndDate(String city, String district, String date);

    List<? extends GraphDto> cityAndDistrictAndNeighborhood(String city, String district, String neighborhood);

    List<? extends GraphDto> cityAndDistrictAndNeighborhoodAndDate(String city, String district, String neighborhood, String date);

    List<? extends GraphDto> cityAndNeighborhood(String city, String neighborhood);

    List<? extends GraphDto> cityAndNeighborhoodAndDate(String city, String neighborhood, String date);

}
