package com.manufacture.model;

import com.manufacture.enums.Ability;
import com.manufacture.enums.ModelName;
import com.manufacture.interfaces.NewCarModel;
import com.manufacture.unitls.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tata extends Functionaries implements NewCarModel {

    private List<Ability> abilities = new ArrayList<>();
    private Car car;

    public Tata(String color, String fuelType, int numberOfGear) {
        try {
            this.abilities.add(pull());

            if (Objects.nonNull(color) && Objects.nonNull(fuelType) && Utils.checkNumberOfGear(numberOfGear)) {
                this.car = new Car(ModelName.TATA, color, fuelType, numberOfGear);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Inputs are null Or " + e.getMessage());
        }
    }

    @Override
    public Ability pull() {
        return super.pull();
    }


    @Override
    public void hasAbilities() {
        System.out.println("Ferrari can : " + abilities);
    }

    @Override
    public void hasColor() {
        System.out.println("Model Color :  " + this.car.getColor());
    }

    @Override
    public void hasFuelType() {
        System.out.println("Fuel Type : " + this.car.getFuelType());
    }

    @Override
    public void hasNumberOfGears() {
        System.out.println("Number Of Gears : " + this.car.getNumberOfGear());
    }

    @Override
    public void modelName() {
        System.out.println("Model Name : " + this.car.getModelName());
    }
}
