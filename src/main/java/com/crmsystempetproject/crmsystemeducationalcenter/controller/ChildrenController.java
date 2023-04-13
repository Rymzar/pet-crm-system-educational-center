package com.crmsystempetproject.crmsystemeducationalcenter.controller;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ChildrenEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;

    @GetMapping("/children")
    public List<ChildrenEntity> getAllChildrens() {
        return childrenService.getAllChildren();
    }

    @GetMapping("/children/{id}")
    public ResponseEntity<ChildrenEntity> getByChildrenId(@PathVariable(value = "id") Long id) {
        ChildrenEntity children = childrenService.getChildrenById(id);
        if (children == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(children);
    }

    @PostMapping("/children")
    public ChildrenEntity createChildren(@RequestBody ChildrenEntity children) {
        return childrenService.saveChildren(children);
    }

    @DeleteMapping("/children/{id}")
    public ResponseEntity<ChildrenEntity> deleteChildren(@PathVariable(value = "id") Long id) {
        ChildrenEntity children = childrenService.getChildrenById(id);
        if (children == null) return ResponseEntity.notFound().build();
        childrenService.deleteChidrenById(id);
        return ResponseEntity.ok().build();
    }
}
