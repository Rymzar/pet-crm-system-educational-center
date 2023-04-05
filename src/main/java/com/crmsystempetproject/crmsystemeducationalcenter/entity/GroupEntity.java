package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//БД группа
@Entity
@Table(name = "group")
@Data
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group", nullable = false, unique = true)
    private String group;
    @Column(name = "item", nullable = false)
    private String item;
    @Column(name = "years_of_study", nullable = false)
    private String yearOfStudy;
}
