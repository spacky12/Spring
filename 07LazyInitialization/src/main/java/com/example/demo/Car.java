package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Car implements Vehicle{
    Car()
    {
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getTopSpeed() {
        return "Top speed of car : 200 kmph :-)";
    }
}
