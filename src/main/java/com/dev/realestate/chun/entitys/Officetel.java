package com.dev.realestate.chun.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Table(name = "officetel_tbl")
@Entity
@Getter
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
}
