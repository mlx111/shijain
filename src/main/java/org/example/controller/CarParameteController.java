package org.example.controller;


import org.example.service.CarParametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarParameteController {
    @Autowired
    private CarParametersService carParametersService;
}
