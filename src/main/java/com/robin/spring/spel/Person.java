package com.robin.spring.spel;

public class Person {
    private String name;
    private Car car;
    private String city;
    private String info;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
        System.out.println("Setting car...");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
