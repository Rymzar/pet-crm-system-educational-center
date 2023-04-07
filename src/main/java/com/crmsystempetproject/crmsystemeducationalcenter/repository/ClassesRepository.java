package com.crmsystempetproject.crmsystemeducationalcenter.repository;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ClassesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<ClassesEntity, Long> {
}
