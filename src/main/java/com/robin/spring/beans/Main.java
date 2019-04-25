package com.robin.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) cnt.getBean("helloWorld2");
        helloWorld.sayHello();

        Car car = (Car) cnt.getBean("car5");
        System.out.println(car.toString());

        Person robin = (Person) cnt.getBean("robin2");
        System.out.println(robin.toString());
    }
}
