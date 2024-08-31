package org.example.controller;

import org.example.service.CityCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityCarController {
    @Autowired
    private CityCarService cityCarService;
}
