package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;


//БД учителя
@Entity
@Data
@Table(name = "teachers")
public class TeachersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personnel_number")
    private Long personnelNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "education")
    private String education;
    @Column(name = "registrtiom_address")
    private String registrationAddress;
    @Column(name = "actual_address")
    private String actualAddress;
    @Column(name = "date_birth")
    private String dateBirth;
    @Column(name = "passport")
    private String passport;
    @Column(name = "issued_by")
    private String issuedBy;
    @Column(name = "date_of_issue")
    private String dateOfIssue;
    @Column(name = "date_of_construction")
    private String dateOfConstruction;
    @Column(name = "category")
    private String category;
    @Column(name = "general_experience")
    private int generalExperience;

}
