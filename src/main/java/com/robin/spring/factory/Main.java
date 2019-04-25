package com.robin.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car = (Car)cnt.getBean("car1");
        System.out.println(car.toString());

        car = (Car)cnt.getBean("car2");
        System.out.println(car.toString());
    }
}
