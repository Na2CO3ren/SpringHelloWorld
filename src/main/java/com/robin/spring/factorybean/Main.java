package com.robin.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-factorybean.xml");

        Car car = (Car)cnt.getBean("car");
        System.out.println(car.toString());
    }
}
