package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    @Override
    public String getTopSpeed() {
        return "Speed of Bike is : 200 kmph";
    }
}
