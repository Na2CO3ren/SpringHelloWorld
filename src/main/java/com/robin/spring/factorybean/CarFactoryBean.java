package com.robin.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Object getObject() throws Exception {
        return new Car(brand,200);
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
