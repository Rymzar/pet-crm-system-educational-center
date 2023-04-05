package com.crmsystempetproject.crmsystemeducationalcenter.repository;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.TeachersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<TeachersEntity, Long> {
}
