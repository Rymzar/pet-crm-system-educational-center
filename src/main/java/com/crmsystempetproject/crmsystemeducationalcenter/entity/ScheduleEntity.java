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
    @Column(name = "number")
    private Long number;
    @Column(name = "data_of_the_week")
    private String dayOfTheWeek;
    @Column(name = "cabinet")
    private String cabinet;
    @Column(name = "personnel_number")
    private Long personnelNumber;
    @Column(name = "group")
    private String group;
}
