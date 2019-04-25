package com.robin.spring.spel;

public class Car {
    private String brand;
    private double price;
    private double tyreParameter;

    public static double PI = 3.14;

    public static double calPar(double pi) {
        return pi * 10;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTyreParameter(double tyreParameter) {
        this.tyreParameter = tyreParameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyreParameter=" + tyreParameter +
                '}';
    }
}
