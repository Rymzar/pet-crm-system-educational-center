package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//Расписание
@Entity
@Table(name = "schedule")
@Data
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number", nullable = false, unique = true)
    private Long number;
    @Column(name = "data_of_the_week", nullable = false)
    private String dayOfTheWeek;
    @Column(name = "cabinet", nullable = false)
    private String cabinet;
    @Column(name = "personnel_number", nullable = false)
    private Long personnelNumber;
    @Column(name = "group", nullable = false)
    private String group;
}
