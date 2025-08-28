package util;

import com.example.demo.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public String getTopSpeed() {
        return "Top speed of car : 200 kmph :-)";
    }
}
