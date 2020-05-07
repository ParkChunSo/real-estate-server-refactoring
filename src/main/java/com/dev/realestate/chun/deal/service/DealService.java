package com.dev.realestate.chun.deal.service;

import com.dev.realestate.chun.deal.repository.apartment.AptTransactionHistoryRepo;
import com.dev.realestate.chun.deal.repository.house.HouseTransactionHistoryRepo;
import com.dev.realestate.chun.deal.repository.officetel.OfficetelTransactionHistoryRepo;
import com.dev.realestate.chun.enums.DealType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DealService {
    private final AptTransactionHistoryRepo aptRepository;
    private final OfficetelTransactionHistoryRepo officetelRepository;
    private final HouseTransactionHistoryRepo houseRepository;

    public void findByCity(DealType type, String city){

    }
}
