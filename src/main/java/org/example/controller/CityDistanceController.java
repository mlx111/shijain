package org.example.controller;

import org.example.service.CityDistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityDistanceController {
    @Autowired
    private CityDistanceService cityDistanceService;
}
