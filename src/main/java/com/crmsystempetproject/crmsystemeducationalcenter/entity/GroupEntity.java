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
    @Column(name = "group")
    private String group;
    @Column(name = "item")
    private String item;
    @Column(name = "years_of_study")
    private String yearOfStudy;
}
