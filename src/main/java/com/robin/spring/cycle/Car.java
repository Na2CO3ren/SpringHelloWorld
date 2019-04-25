package com.robin.spring.cycle;

public class Car {
    private String band;

    public void setBand(String band) {
        System.out.println("Car set...");
        this.band = band;
    }

    public Car() {
        System.out.println("Car construct...");
    }

    public void init() {
        System.out.println("Car init...");
    }

    public void destroy() {
        System.out.println("Car destroy...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                '}';
    }
}
