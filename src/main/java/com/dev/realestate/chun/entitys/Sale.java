package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;
import com.dev.realestate.chun.enums.SaleState;

import javax.persistence.*;
import java.util.Set;

/**
 * 부동산 거래 내역 테이블
 * id: primary key
 * price: 거래 가격(단위: 만원)
 * deposit: 보증금(전세 or 월세일 경우)
 * agent: 현재 거래 정보를 올린 중개인 정보
 * building: 건물 정보
 * state: 현재 거래 상태(대기, 매매중, 연락중,
 * type: 거래 형태(매매, 전세, 월세)
 */
@Table(name = "sale_tbl")
@Entity
public class Sale {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 거래될 가격(단위 만원)
    private Double price;

    //월세 또는 전세일 경우 보증금;
    private Double deposit = 0.0;

    // 중개인 정보 1:N 관계
    private User agent;

    //TODO("빌딩이 없을 수 있다. 이점 유의하며 개발")
    private Building building;

    @Enumerated(EnumType.STRING)
    private SaleState state;

    private Set<DealType> type;

}
