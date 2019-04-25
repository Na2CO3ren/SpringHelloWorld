package com.robin.spring.beans;

public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("HelloWorld Construct...");
    }

    public void setName2(String name) {
        this.name = name;
        System.out.println("Setting name " + name + "...");
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
