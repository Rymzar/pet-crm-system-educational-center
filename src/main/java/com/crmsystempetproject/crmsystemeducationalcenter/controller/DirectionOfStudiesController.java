package com.crmsystempetproject.crmsystemeducationalcenter.controller;

import com.crmsystempetproject.crmsystemeducationalcenter.entity.DirectionsOfStudiesEntity;
import com.crmsystempetproject.crmsystemeducationalcenter.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DirectionOfStudiesController {
    @Autowired
    private DirectionService directionService;

    @GetMapping("/direction")
    public List<DirectionsOfStudiesEntity> getAllDirection() {
        return directionService.getAllDirections();
    }

    @GetMapping("/direction/{id}")
    public ResponseEntity<DirectionsOfStudiesEntity> getDirectionById(@PathVariable(value = "id") Long id) {
        DirectionsOfStudiesEntity directions = directionService.getDirectionsById(id);
        if (directions == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(directions);
    }

    @PostMapping("/direction")
    public DirectionsOfStudiesEntity saveDirection(@RequestBody DirectionsOfStudiesEntity directions) {
        return directionService.saveDirection(directions);
    }

    @DeleteMapping("/direction/{id}")
    public ResponseEntity<DirectionsOfStudiesEntity> deleteByDirectionId(@PathVariable(value = "id") Long id) {
        DirectionsOfStudiesEntity directions = directionService.getDirectionsById(id);
        if (directions == null) {
            return ResponseEntity.notFound().build();
        }
        directionService.saveDirection(directions);
        return ResponseEntity.ok().build();
    }

}
