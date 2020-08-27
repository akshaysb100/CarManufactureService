package com.manufacture.service;

import com.manufacture.Utils;
import com.manufacture.enums.Ability;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;
import com.manufacture.model.CarProperty;

import java.util.Objects;

public class ManufactureCar {

    private Car car;

    public ManufactureCar(ModelName modelName, Ability features, String color, String fuelType, int numberOfGear) {
        try {
            if (Objects.nonNull(color) && Objects.nonNull(fuelType) && Utils.checkNumberOfGear(numberOfGear)) {
                this.car = new Car(new CarProperty(modelName, color, fuelType, numberOfGear), features);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Inputs are null Or " + e.getMessage());
        }
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
