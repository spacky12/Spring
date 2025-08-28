package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private Bike bike;

    // Setter injection
    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public void run() {
        bike.speed();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) context.getBean("app");
        app.run();
    }
}
