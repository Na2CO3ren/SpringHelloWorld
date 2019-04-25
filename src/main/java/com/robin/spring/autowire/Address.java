package com.robin.spring.autowire;

public class Address {
    private String city;
    private String street;

    public Address() {
        System.out.println("Address Constructing...");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
