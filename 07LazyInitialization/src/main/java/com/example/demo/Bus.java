package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Bus implements Vehicle{
    Bus()
    {
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getTopSpeed() {
        return "Speed of Bus is : 100 kmph";
    }
}
