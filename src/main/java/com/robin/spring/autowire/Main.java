package com.robin.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-autowire.xml");

        Person robin = (Person)cnt.getBean("robin");
        System.out.println(robin.toString());
    }
}
