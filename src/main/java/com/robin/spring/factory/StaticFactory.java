package com.robin.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("AODI",new Car("AODI",200));
        cars.put("BMW",new Car("BMW",300));
    }

    public static Car getCar(String brand) {
        return cars.get(brand);
    }
}
