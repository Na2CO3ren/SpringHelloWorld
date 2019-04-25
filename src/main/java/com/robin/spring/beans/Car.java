package com.robin.spring.beans;

public class Car {
    private String brand;
    private String name;
    private double price;
    private int maxSpeed;

    public Car() {
        System.out.println("com.robin.spring.beans.Car Construct(No Parameter)...");
    }

    public Car(String brand, String name, int maxSpeed) {
        this.brand = brand;
        this.name = name;
        this.maxSpeed = maxSpeed;
        System.out.println("com.robin.spring.beans.Car Construct(With Parameter)...");
    }

    public Car(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        System.out.println("com.robin.spring.beans.Car Construct(With Parameter)...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Setting com.robin.spring.beans.Car " + brand + "...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "com.robin.spring.beans.Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
