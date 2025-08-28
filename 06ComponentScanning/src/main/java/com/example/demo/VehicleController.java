package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    Vehicle v1;

    @Autowired
    VehicleController(@Qualifier("bike") Vehicle v1)
    {
        this.v1=v1;
    }
    @GetMapping("/speed")
    String getTopSpeed()
    {
        return v1.getTopSpeed();
    }
}
