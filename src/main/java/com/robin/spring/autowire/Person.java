package com.robin.spring.autowire;

public class Person {
    private String name;
    private Car car;
    private Address addr;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
        System.out.println("Setting car...");
    }

    public void setAddr(Address addr) {
        this.addr = addr;
        System.out.println("Setting addr...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", addr=" + addr +
                '}';
    }
}
