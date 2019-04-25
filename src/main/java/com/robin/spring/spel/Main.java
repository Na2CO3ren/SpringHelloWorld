package com.robin.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-spel.xml");

        Address addr = (Address)cnt.getBean("addr");
        System.out.println(addr.toString());

        Car car = cnt.getBean(Car.class);
        System.out.println(car.toString());

        Person robin = (Person)cnt.getBean("robin");
        System.out.println(robin.toString());
    }
}
