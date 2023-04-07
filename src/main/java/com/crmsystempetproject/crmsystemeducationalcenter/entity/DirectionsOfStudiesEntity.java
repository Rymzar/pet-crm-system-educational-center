package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Directions_of_studies")
@Data
public class DirectionsOfStudiesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name_group", nullable = false)
    private String nameGroup;
}
