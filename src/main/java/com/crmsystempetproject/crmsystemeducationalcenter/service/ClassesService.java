package com.crmsystempetproject.crmsystemeducationalcenter.service;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.ClassesEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassesService {
    @Autowired
    private ClassesRepository classesRepository;

    public List<ClassesEntity> getAllClasses() {
        return classesRepository.findAll();
    }

    public ClassesEntity getClassesById(Long id) {
        Optional<ClassesEntity> classes = classesRepository.findById(id);
        return classes.orElse(null);
    }

    public ClassesEntity saveClasses(ClassesEntity classes) {
        classesRepository.save(classes);
        return classes;
    }

    public void deleteClassesById(Long id) {
        classesRepository.deleteById(id);
    }
}
