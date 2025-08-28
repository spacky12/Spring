package util;

import com.example.demo.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public String getTopSpeed() {
        return "Speed of Bike is : 200 kmph";
    }
}
