package com.dev.realestate.chun.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "house_tbl")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String town;
    private String landNum;
    private Double area;
    private Integer constructYear;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<HouseTransactionHistory> transactionHistoryList = new ArrayList<>();
}
