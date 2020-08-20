package com.manufacture;

import com.manufacture.enums.ModelName;
import com.manufacture.factory.CarFactory;
import com.manufacture.interfaces.CarInterface;
import com.manufacture.model.Car;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CarManufactureServiceTest {

    @Test
    public void test_should_manufactureCar_withFeature1() {
        CarManufactureService carManufactureService = new CarManufactureService();
        mockStatic(ModelName.class);
        CarInterface carInterface = mock(CarInterface.class);
        mockStatic(CarFactory.class);
        Car car = mock(Car.class);

        when(CarFactory.getCarDetails(any(ModelName.class))).thenReturn(carInterface);
        when(carInterface.manufactureCar(any(Car.class))).thenReturn(car);

        Car actualCar = carManufactureService.manufactureCar(ModelName.FERRARI);

        Assert.assertEquals(car, actualCar);
    }
}
