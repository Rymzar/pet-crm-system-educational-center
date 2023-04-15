package com.crmsystempetproject.crmsystemeducationalcenter.controller;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ClassesEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassesController {
    @Autowired
    private ClassesService classesService;
    @GetMapping("/classes")
    public List<ClassesEntity> getAllClasses() {
        return classesService.getAllClasses();
    }
    @GetMapping("/classes/{id}")
    public ResponseEntity<ClassesEntity> getClassesById(@PathVariable(value = "id") Long id) {
        ClassesEntity classes = classesService.getClassesById(id);
        if (classes == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(classes);
    }
    @PostMapping ("/classes")
    public ClassesEntity saveClasses(@RequestBody ClassesEntity classes) {
        return classesService.saveClasses(classes);
    }

    @DeleteMapping("/classes/{id}")
    public ResponseEntity<ClassesEntity> deleteClasses(@PathVariable(value = "id") Long id) {
        ClassesEntity classes = classesService.getClassesById(id);
        if (classes == null) {
            return ResponseEntity.notFound().build();
        }
        classesService.deleteClassesById(id);
        return ResponseEntity.ok().build();
    }
}
