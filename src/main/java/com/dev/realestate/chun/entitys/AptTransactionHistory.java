package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;

import javax.persistence.*;

/**
 * 매매 거래정보를 저장하는 테이블
 */

@Table(name = "apt_transaction_history_tbl")
@Entity
public class AptTransactionHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private Double pyPrice;
    private DealType type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;
}
