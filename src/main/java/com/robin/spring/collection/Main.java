package com.robin.spring.collection;

import org.omg.CORBA.MARSHAL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person robin = (Person)cnt.getBean("robin24");
        System.out.println(robin.toString());

        MapPerson newRobin = (MapPerson) cnt.getBean("robin23");
        System.out.println(newRobin.toString());
    }
}
