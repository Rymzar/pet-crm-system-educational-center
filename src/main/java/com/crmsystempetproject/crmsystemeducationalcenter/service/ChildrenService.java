package com.crmsystempetproject.crmsystemeducationalcenter.service;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ChildrenEntity;

import java.util.List;
import java.util.Optional;

public interface ChildrenService {
    ChildrenEntity addChildren(ChildrenEntity children);
    void delete(Long id);
    Optional<ChildrenEntity> getByName(Long id);
    ChildrenEntity editChildren(ChildrenEntity children);
    List<ChildrenEntity> getAll();
}
