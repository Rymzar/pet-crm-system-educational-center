package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//БД учащиеся
@Entity
@Table(name = "childrens")
@Data
public class ChildrenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "bdate")
    private String bdate;

}
