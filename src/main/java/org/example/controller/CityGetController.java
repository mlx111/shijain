package org.example.controller;

import org.example.domain.CityGet;
import org.example.service.CityGetService;
import org.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityGetController {
    @Autowired
    private CityGetService cityGetService;

    @RequestMapping()
    public void getCityGet(@RequestBody CityGet cityGet){
        cityGetService.save(cityGet);
    }
}
