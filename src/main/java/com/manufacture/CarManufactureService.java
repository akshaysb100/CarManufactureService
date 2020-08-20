package com.manufacture;

import com.manufacture.enums.ModelName;
import com.manufacture.factory.CarFactory;
import com.manufacture.interfaces.CarInterface;
import com.manufacture.model.Car;

public class CarManufactureService {

    public Car manufactureCar(ModelName modelName) {
        Car car = new Car();
        CarInterface carInterface = CarFactory.getCarDetails(modelName);
        return carInterface.manufactureCar(car);
    }
}
