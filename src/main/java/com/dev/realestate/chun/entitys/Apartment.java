package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.HousingType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

/**
 * 빌딩 정보를 저장하는 테이블
 * id: primary key
 * city: 특별시, 도
 * district: 시, 군 등
 * town: 읍, 면, 동 등
 * streetNum: 도로명주소
 * landNum:지번
 * aptName: 아파트 이름
 * area: 면적
 * floor: 층
 * constructYear: 설립 연도
 */
@Table(name = "apt_tbl")
@Entity @Getter
@AllArgsConstructor
public class Apartment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String town;
    private String streetNum;
    private String landNum;
    private String aptName;
    private Double area;
    private Integer floor;
    private Integer constructYear;
}
