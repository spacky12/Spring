package util;

import com.example.demo.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {
    @Override
    public String getTopSpeed() {
        return "Speed of Bus is : 100 kmph";
    }
}
