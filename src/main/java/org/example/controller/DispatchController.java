package org.example.controller;

import org.example.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatchController {
    @Autowired
    private DispatchService dispatchService;
}
