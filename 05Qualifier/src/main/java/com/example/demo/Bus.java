package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
    @Override
    public String getTopSpeed() {
        return "Speed of Bus is : 100 kmph";
    }
}
