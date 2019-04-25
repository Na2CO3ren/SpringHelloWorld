package com.robin.spring.beans;

public class Person {
    private String name;
    private int age;
    private Car car;

    public Person() {
        System.out.println("com.robin.spring.beans.Person Construct...");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setting name " + name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Setting age of " + name);
    }

    public void setCar(Car car) {
        this.car = car;
        System.out.println("Setting The com.robin.spring.beans.Car " + car + " of com.robin.spring.beans.Person " + name);
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "com.robin.spring.beans.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
