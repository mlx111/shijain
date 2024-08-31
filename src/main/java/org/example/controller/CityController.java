package org.example.controller;

import org.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;
}
