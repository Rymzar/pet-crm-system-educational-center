package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//Расписание звонков
@Entity
@Table(name = "call_shedule")
@Data
public class CallScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number", nullable = false, unique = true)
    private Long number;
    @Column(name = "time_spending", nullable = false)
    private String timeSpending;
}
