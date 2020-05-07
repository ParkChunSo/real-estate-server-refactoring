package com.dev.realestate.chun.entitys;

import com.dev.realestate.chun.enums.DealType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class TransactionHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private Double pyPrice;
    @Enumerated(EnumType.STRING)
    private DealType type;
    private LocalDate date;
}
