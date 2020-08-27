package com.manufacture.model;

import com.manufacture.enums.ModelName;

public class Car {
    private ModelName modelName;
    private String color;
    private String fuelType;
    private int numberOfGear;

    public Car(ModelName modelName, String color, String fuelType, int numberOfGear) {
        this.modelName = modelName;
        this.color = color;
        this.fuelType = fuelType;
        this.numberOfGear = numberOfGear;
    }

    public ModelName getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }
}
