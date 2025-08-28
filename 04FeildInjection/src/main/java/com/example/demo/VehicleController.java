package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @Autowired
    Vehicle v1;
    @GetMapping("/speed")
    String getTopSpeed()
    {
        return v1.getTopSpeed();
    }
}
