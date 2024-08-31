package org.example.controller;

import org.example.service.CityCarOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class City_Car_OverviewController {
    @Autowired
    private CityCarOverviewService cityCarOverviewService;
}
