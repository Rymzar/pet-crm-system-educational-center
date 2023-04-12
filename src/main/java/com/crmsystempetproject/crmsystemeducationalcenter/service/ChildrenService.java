package com.crmsystempetproject.crmsystemeducationalcenter.service;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ChildrenEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.repository.ChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildrenService {
    @Autowired
    private ChildrenRepository childrenRepository;

    public List<ChildrenEntity> getAllChildren() {
        return childrenRepository.findAll();
    }

    public ChildrenEntity getChidrenById(Long id) {
        Optional<ChildrenEntity> children = childrenRepository.findById(id);
        return children.orElse(null);
    }

    public void saveChildren(ChildrenEntity children) {
        childrenRepository.save(children);
    }

    public void deleteChidrenById(Long id) {
        childrenRepository.deleteById(id);
    }
}
