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
 * num: 빌딩 고유 번호
 * area: 면적
 * constructYear: 설립 연도
 * floor: 층
 * type: 아파트, 오피스텔, 단독주택
 */
@Table(name = "building_tbl")
@Entity @Getter
@AllArgsConstructor
public class Building {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String town;
    private String num;
    private Double area;
    private int floor;
    private int constructYear;
    @Enumerated(EnumType.STRING)
    private HousingType type;
}
