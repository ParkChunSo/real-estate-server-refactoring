package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;
import lombok.Getter;

import javax.persistence.*;

/**
 * 월세 거래정보를 저장하는 테이블
 */
@Table(name = "house_transaction_history_tb")
@Entity @Getter
@DiscriminatorValue("house")
public class HouseTransactionHistory extends TransactionHistory{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "house_id")
    private House house;
}
