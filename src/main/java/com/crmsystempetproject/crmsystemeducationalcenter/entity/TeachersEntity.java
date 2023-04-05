package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;


//БД учителя
@Entity
@Table(name = "teachers")
@Data
public class TeachersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personnel_number", nullable = false, unique = true)
    private Long personnelNumber;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "education", nullable = false)
    private String education;
    @Column(name = "registrtiom_address", nullable = false)
    private String registrationAddress;
    @Column(name = "actual_address", nullable = false)
    private String actualAddress;
    @Column(name = "date_birth", nullable = false)
    private String dateBirth;
    @Column(name = "passport", nullable = false)
    private String passport;
    @Column(name = "issued_by", nullable = false)
    private String issuedBy;
    @Column(name = "date_of_issue", nullable = false)
    private String dateOfIssue;
    @Column(name = "date_of_construction", nullable = false)
    private String dateOfConstruction;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "general_experience", nullable = false)
    private int generalExperience;

}
