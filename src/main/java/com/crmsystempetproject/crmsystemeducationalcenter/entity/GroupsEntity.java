package com.crmsystempetproject.crmsystemeducationalcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "groups")
@Data
public class GroupsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "children_id", nullable = false)
    private int childrenId;
    @Column(name = "group_id", nullable = false)
    private int groupId;
    @Column(name = "receipt_date", nullable = false)
    private String receiptDate;
    @Column(name = "enrollment-date", nullable = false)
    private String EnrollmentDate;
    @Column(name = "transfer")
    private String transfer;
}
