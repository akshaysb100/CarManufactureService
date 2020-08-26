package com.manufacture.model;

import com.manufacture.enums.Ability;

public class Car {
    private Ability ability;
    private CarProperty property;

    public Car(CarProperty property, Ability ability) {
        this.property = property;
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

    public CarProperty getProperty() {
        return property;
    }
}
