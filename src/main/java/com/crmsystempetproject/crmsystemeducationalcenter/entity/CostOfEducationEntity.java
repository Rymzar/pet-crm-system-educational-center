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
    @Column(name = "calculation_code", nullable = false, unique = true)
    private Long calculationCode;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "total_cost", nullable = false)
    private int totalCost;
    @Column(name = "year_of_study", nullable = false)
    private String yearOfStudy;
}
