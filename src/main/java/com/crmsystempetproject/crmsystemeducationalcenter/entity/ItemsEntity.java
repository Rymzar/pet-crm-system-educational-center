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
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "reducation")
    private String reduction;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "term")
    private int term;
}

