package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public String getTopSpeed() {
        return "Top speed of car : 200 kmph";
    }
}
