package com.dev.realestate.chun.deal.repository.apartment;

import com.dev.realestate.chun.entitys.AptTransactionHistory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AptTransactionHistoryRepoCustomImpl extends QuerydslRepositorySupport implements AptTransactionHistoryRepoCustom {
    public AptTransactionHistoryRepoCustomImpl() {
        super(AptTransactionHistory.class);
    }
}
