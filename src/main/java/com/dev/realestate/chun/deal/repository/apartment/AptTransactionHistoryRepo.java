package com.dev.realestate.chun.deal.repository.apartment;

import com.dev.realestate.chun.entitys.AptTransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AptTransactionHistoryRepo extends JpaRepository<AptTransactionHistory, Long>, AptTransactionHistoryRepoCustom {
    
}
