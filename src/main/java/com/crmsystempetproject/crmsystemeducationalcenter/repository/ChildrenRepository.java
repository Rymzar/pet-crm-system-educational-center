package com.crmsystempetproject.crmsystemeducationalcenter.repository;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ChildrenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends JpaRepository<ChildrenEntity, Long> {

}
