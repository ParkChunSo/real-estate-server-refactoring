package com.dev.realestate.chun.entitys;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 매매 거래정보를 저장하는 테이블
 */

@Table(name = "apt_transaction_history_tbl")
@Entity @Getter @Setter
@DiscriminatorValue("apart")
public class AptTransactionHistory extends TransactionHistory{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;
}
