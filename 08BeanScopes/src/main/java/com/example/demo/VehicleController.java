package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    Vehicle v1;
    Vehicle v2;
    @Autowired
    VehicleController(@Qualifier("car") Vehicle v1,
                        @Qualifier("car") Vehicle v2)
    {
        System.out.println("In Constructor: "+ getClass().getSimpleName());
        this.v1=v1;
        this.v2=v2;
    }
    @GetMapping("/speed")
    String getTopSpeed()
    {
        return v1.getTopSpeed();
    }

    @GetMapping("/scope")
    String checkScope()
    {
        if(v1==v2) return "Scope of bean is singleton";
        else return "Scope of bean is prototype";
    }
}
