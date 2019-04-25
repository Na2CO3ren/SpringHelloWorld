package com.robin.spring.collection;

import com.robin.spring.beans.Car;

import java.util.Map;

public class MapPerson {
    private String name;
    private int age;
    private Map<String, Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "MapPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
