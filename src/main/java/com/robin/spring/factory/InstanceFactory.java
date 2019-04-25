package com.robin.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
    private Map<String,Car> cars = null;

    public InstanceFactory() {
        cars = new HashMap<String, Car>();
        cars.put("AODI",new Car("AODI",200));
        cars.put("BMW",new Car("BMW",300));
    }

    public Car getCar(String brand) {
        return cars.get(brand);
    }
}
