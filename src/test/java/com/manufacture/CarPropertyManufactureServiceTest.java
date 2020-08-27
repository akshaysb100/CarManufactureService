package com.manufacture;

import com.manufacture.enums.ModelName;
import com.manufacture.interfaces.CarInterface;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CarPropertyManufactureServiceTest {

    @Test
    public void test_should_manufactureCar_withFeature1() {
        CarManufactureService carManufactureService = new CarManufactureService();
        mockStatic(ModelName.class);
        CarInterface carInterface = mock(CarInterface.class);
        mockStatic(CarFactory.class);
        CarProperty carProperty = mock(CarProperty.class);

        when(CarFactory.getCarDetails(any(ModelName.class))).thenReturn(carInterface);
        when(carInterface.manufactureCar(any(CarProperty.class))).thenReturn(carProperty);

        CarProperty actualCarProperty = carManufactureService.manufactureCar(ModelName.FERRARI);

        Assert.assertEquals(carProperty, actualCarProperty);
    }
}
