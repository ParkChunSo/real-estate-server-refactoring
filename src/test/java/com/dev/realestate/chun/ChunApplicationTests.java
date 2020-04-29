package com.dev.realestate.chun;

import com.dev.realestate.chun.deal.repository.apartment.AptTransactionHistoryRepo;
import com.dev.realestate.chun.entitys.AptTransactionHistory;
import com.dev.realestate.chun.enums.DealType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ChunApplicationTests {
    @Autowired
    AptTransactionHistoryRepo repo;

    @Test
    void contextLoads() {
    }

    @Test
    void transactionTest(){
        AptTransactionHistory t = new AptTransactionHistory();
        t.setPrice(200d);
        t.setPyPrice(2d);
        t.setType(DealType.BARGAIN);
        t.setDate(Date.valueOf(LocalDate.of(2020, 4, 27)));

        AptTransactionHistory t1 = new AptTransactionHistory();
        t1.setPrice(200d);
        t1.setPyPrice(2d);
        t1.setType(DealType.BARGAIN);
        t1.setDate(Date.valueOf(LocalDate.of(2020, 4, 27)));

        repo.saveAll(Arrays.asList(t, t1));

        List<AptTransactionHistory> all = repo.findAll();

//        assertThat()
        all.forEach(System.out::println);
    }

}
