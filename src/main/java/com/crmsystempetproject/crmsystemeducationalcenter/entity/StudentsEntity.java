package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//БД учащиеся
@Entity
@Table(name = "students")
@Data
public class StudentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "date_birth", nullable = false)
    private String dateBirth;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "study_address", nullable = false)
    private String studyAddress;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "group_learning", nullable = false)
    private String groupLearning;
    @Column(name = "note", nullable = false)
    private String note;
}
