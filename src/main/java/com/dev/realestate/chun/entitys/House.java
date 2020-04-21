package com.dev.realestate.chun.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Table(name = "house_tbl")
@Entity
@Getter
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
}
