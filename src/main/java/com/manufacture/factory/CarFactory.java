package com.manufacture.factory;

import com.manufacture.enums.ModelName;
import com.manufacture.interfaces.CarInterface;
import com.manufacture.service.FerrariCar;
import com.manufacture.service.TataCar;
import com.manufacture.service.TeslaCar;

public class CarFactory {

    public static CarInterface getCarDetails(ModelName modelName) {
        if (modelName.equals(ModelName.FERRARI)) {
            return new FerrariCar();
        } else if (modelName.equals(ModelName.TATA)) {
            return new TataCar();
        } else {
            return new TeslaCar();
        }
    }
}
