package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;


//БД учителя
@Entity
@Table(name = "classes")
@Data
public class ClassesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "teacher", nullable = false)
    private String teacher;
    @Column(name = "course_id", nullable = false)
    private int courseId;
    @Column(name = "area", nullable = false)
    private String area;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "hourly_coast", nullable = false)
    private int hourlyCost;
    @Column(name = "number_of_hours", nullable = false)
    private int numberOfHours;


}
