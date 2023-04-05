package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

//БД предмет
@Entity
@Table(name = "items")
@Data
public class ItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_name", nullable = false, unique = true)
    private String itemName;
    @Column(name = "reducation", nullable = false)
    private String reduction;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "term", nullable = false)
    private int term;
}

