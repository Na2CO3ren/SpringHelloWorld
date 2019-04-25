package com.robin.spring.relation;

import com.robin.spring.autowire.Address;
import com.robin.spring.autowire.Car;
import com.robin.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-relation.xml");

//        Address address = (Address)cnt.getBean("addr");
//        System.out.println(address.toString());

        Address address = (Address)cnt.getBean("addr2");
        System.out.println(address.toString());

        address.setStreet("DongGuan");
        address = (Address)cnt.getBean("addr2");
        System.out.println(address.toString());

        Person robin = (Person)cnt.getBean("robin");
        System.out.println(robin.toString());

        Car car = (Car)cnt.getBean("carProp");
        System.out.println(car.toString());
    }
}
