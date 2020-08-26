package com.manufacture.service;

import com.manufacture.enums.Ability;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;
import com.manufacture.model.CarProperty;

public class CarFactory {

    private Car car;

    public CarFactory(ModelName modelName, Ability features, String color, String fuelType, int numberOfGear) {
        this.car = new Car(new CarProperty(modelName, color, fuelType, numberOfGear), features);
    }

    public Ability hasAbility() {
        return this.car.getAbility();
    }

    public ModelName modelName() {
        return this.car.getProperty().getModelName();
    }

    public String modelColor() {
        return this.car.getProperty().getColor();
    }

    public String fuelType() {
        return this.car.getProperty().getFuelType();
    }

    public int numberOfGear() {
        return this.car.getProperty().getNumberOfGear();
    }
}
