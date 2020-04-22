package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;
import lombok.Getter;

import javax.persistence.*;

/**
 * 전세 거래정보를 저장하는 테이블
 */

@Table(name = "officetel_transaction_history_tb;")
@Entity @Getter
public class OfficetelTransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private Double pyPrice;
    private DealType type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "officetel_id")
    private Officetel officetel;
}
