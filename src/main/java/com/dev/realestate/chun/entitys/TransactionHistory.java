package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class TransactionHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String city;
//    private String district;
//    private String dong;
    private Double price;
    private Double pyPrice;
    @Enumerated(EnumType.STRING)
    private DealType type;
    @Temporal(value = TemporalType.DATE)
    private Date date;
}
