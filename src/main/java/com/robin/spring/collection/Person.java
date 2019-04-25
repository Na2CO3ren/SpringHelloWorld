package com.robin.spring.collection;

import com.robin.spring.beans.Car;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> cars;

    public Person() {
        System.out.println("Person Construct...");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setting name " + name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Setting age of " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
