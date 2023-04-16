package com.crmsystempetproject.crmsystemeducationalcenter.controller;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.GroupsEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/group")
    public List<GroupsEntity> getAllGroup() {
        return groupService.getAllGroup();
    }

    @GetMapping("/group/{id}")
    public ResponseEntity<GroupsEntity> getGroupById(@PathVariable(value = "id") Long id) {
        GroupsEntity groups = groupService.getGroupId(id);
        if (groups == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(groups);
    }

    @PostMapping("/group")
    public GroupsEntity saveGroup(@RequestBody GroupsEntity groups) {
        return groupService.saveGroup(groups);
    }

    @DeleteMapping("/group/{id}")
    public ResponseEntity<GroupsEntity> deleteGroupById(@PathVariable(value = "id") Long id) {
        GroupsEntity groups = groupService.getGroupId(id);
        if (groups == null) {
            ResponseEntity.notFound().build();
        }
        groupService.saveGroup(groups);
        return ResponseEntity.ok().build();
    }
}
