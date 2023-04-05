package com.crmsystempetproject.crmsystemeducationalcenter.repository;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsEntity, String> {
}
