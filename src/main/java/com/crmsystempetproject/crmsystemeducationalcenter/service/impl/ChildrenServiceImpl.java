package com.crmsystempetproject.crmsystemeducationalcenter.service.impl;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ChildrenEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.repository.ChildrenRepository;
import com.crmsystempetproject.crmsystemeducationalcenter.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ChildrenServiceImpl implements ChildrenService {
    @Autowired
    private ChildrenRepository childrenRepository;

    @Override
    public ChildrenEntity addChildren(ChildrenEntity children) {

        ChildrenEntity saveChildren = childrenRepository.saveAndFlush(children);

        return saveChildren;
    }

    @Override
    public void delete(Long id) {
        childrenRepository.deleteAll();
    }

    @Override
    public Optional<ChildrenEntity> getByName(Long id) {
        return childrenRepository.findById(id);
    }

    @Override
    public ChildrenEntity editChildren(ChildrenEntity children) {
        return childrenRepository.saveAndFlush(children);
    }

    @Override
    public List<ChildrenEntity> getAll() {
        return childrenRepository.findAll();
    }
}
