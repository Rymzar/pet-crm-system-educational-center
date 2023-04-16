package com.crmsystempetproject.crmsystemeducationalcenter.service;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.GroupsEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.repository.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    private GroupsRepository groupsRepository;

    public List<GroupsEntity> getAllGroup() {
        return groupsRepository.findAll();
    }

    public GroupsEntity getGroupId(Long id) {
        Optional<GroupsEntity> groups = groupsRepository.findById(id);
        return groups.orElse(null);
    }

    public GroupsEntity saveGroup(GroupsEntity groups) {
        groupsRepository.save(groups);
        return groups;
    }

    public void deleteGroupByID(Long id) {
        groupsRepository.deleteById(id);
    }

}
