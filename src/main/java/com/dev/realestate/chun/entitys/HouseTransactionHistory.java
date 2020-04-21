package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;

import javax.persistence.*;

/**
 * 월세 거래정보를 저장하는 테이블
 */
@Table(name = "house_transaction_history_tb")
@Entity
public class HouseTransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private Double pyPrice;
    private DealType type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "house_id")
    private House house;
}
