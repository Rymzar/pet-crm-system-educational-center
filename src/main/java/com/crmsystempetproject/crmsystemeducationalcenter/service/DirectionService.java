package com.crmsystempetproject.crmsystemeducationalcenter.service;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.DirectionsOfStudiesEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.repository.DirectionsOfStudiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionService {

    @Autowired
    private DirectionsOfStudiesRepository directionsOfStudiesRepository;

    public List<DirectionsOfStudiesEntity> getAllDirections() {
        return directionsOfStudiesRepository.findAll();
    }

    public DirectionsOfStudiesEntity getDirectionsById(Long id) {
        Optional<DirectionsOfStudiesEntity> directions = directionsOfStudiesRepository.findById(id);
        return directions.orElse(null);
    }

    public void saveDirection(DirectionsOfStudiesEntity directions) {
        directionsOfStudiesRepository.save(directions);
    }

    public void deleteDirectionById(Long id) {
        directionsOfStudiesRepository.deleteById(id);
    }
}
