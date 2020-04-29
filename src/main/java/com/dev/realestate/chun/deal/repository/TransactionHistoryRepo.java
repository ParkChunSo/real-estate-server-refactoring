package com.dev.realestate.chun.deal.repository;

import com.dev.realestate.chun.entitys.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory, Long> {

}
