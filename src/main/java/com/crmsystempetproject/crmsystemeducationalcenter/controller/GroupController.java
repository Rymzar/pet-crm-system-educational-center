package com.crmsystempetproject.crmsystemeducationalcenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
    @GetMapping("/")
    public String getGroup() {
        return "Hello spring";
    }
}
