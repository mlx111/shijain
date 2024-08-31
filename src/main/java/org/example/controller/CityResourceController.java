package org.example.controller;

import org.example.service.CityResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityResourceController {
    @Autowired
    private CityResourceService cityResourceService;
}
