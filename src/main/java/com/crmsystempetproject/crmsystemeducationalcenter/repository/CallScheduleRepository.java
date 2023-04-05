package com.crmsystempetproject.crmsystemeducationalcenter.repository;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.CallScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallScheduleRepository extends JpaRepository<CallScheduleEntity, Long> {
}
