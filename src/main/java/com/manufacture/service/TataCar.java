package com.manufacture.service;

import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.interfaces.CarInterface;
import com.manufacture.model.Car;

public class TataCar implements CarInterface {
    @Override
    public Car manufactureCar(Car car) {
        car.setModelName(ModelName.TATA);
        car.setCarFeatures(CarFeatures.ABILITY_PULL);
        return car;
    }
}
