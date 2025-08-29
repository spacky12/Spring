package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    Vehicle v1;

    @Autowired
    VehicleController(@Qualifier("car") Vehicle v1)
    {
        System.out.println("In Constructor: "+ getClass().getSimpleName());
        this.v1=v1;
    }
    @PostConstruct
    void display()
    {
        System.out.println("Post Construct");
    }

    @PreDestroy
    void display1()
    {
        System.out.println("Before Destroying");
    }
    @GetMapping("/speed")
    String getTopSpeed()
    {
        return v1.getTopSpeed();
    }

}
