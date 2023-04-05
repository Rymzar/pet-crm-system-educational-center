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
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "date_birth")
    private String dateBirth;
    @Column(name = "address")
    private String address;
    @Column(name = "study_address")
    private String studyAddress;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "group_learning")
    private String groupLearning;
    @Column(name = "note")
    private String note;
}
