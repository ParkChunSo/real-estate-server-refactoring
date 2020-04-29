package com.dev.realestate.chun.deal.repository.house;

import com.dev.realestate.chun.entitys.OfficetelTransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseTransactionHistoryRepo extends JpaRepository<OfficetelTransactionHistory, Long> {
}
