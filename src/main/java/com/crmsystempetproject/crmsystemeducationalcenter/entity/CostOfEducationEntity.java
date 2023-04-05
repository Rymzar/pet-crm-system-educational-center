package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//Бд стоимость обучения
@Entity
@Table(name = "cost_of_education")
@Data
public class CostOfEducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calculation_code")
    private Long calculationCode;
    @Column(name = "price")
    private int price;
    @Column(name = "total_cost")
    private int totalCost;
    @Column(name = "year_of_study")
    private String yearOfStudy;
}
