package com.robin.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cnt = new ClassPathXmlApplicationContext("beans-cycle.xml");

        Car car = cnt.getBean(Car.class);
        System.out.println(car.toString());

        cnt.close();
    }
}
