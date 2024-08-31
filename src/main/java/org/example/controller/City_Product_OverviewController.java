package org.example.controller;

import org.example.service.CityProductOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class City_Product_OverviewController {
    @Autowired
    private CityProductOverviewService cityProductOverviewService;
}
