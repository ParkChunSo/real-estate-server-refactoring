package com.dev.realestate.chun.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "officetel_tbl")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Officetel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
    private String town;
    private String landNum;
    private String officetelName;
    private Double area;
    private Integer floor;
    private Integer constructYear;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "officetel", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<OfficetelTransactionHistory> transactionHistoryList = new ArrayList<>();
}
