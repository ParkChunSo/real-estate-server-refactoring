package com.dev.realestate.chun.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
@NoArgsConstructor
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
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "apartment",
            cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<AptTransactionHistory> transactionHistoryList = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "apartment",
            cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Sale> saleList = new ArrayList<>();
}
