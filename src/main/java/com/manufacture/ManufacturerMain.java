package com.manufacture;

import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;

import java.util.Scanner;

public class ManufacturerMain {

    public static void main(String[] args) {
        try {
            CarManufactureService carManufactureService = new CarManufactureService();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome To Car Manufacture Service");
            System.out.println("Choose your car model");
            String clintModelName = scanner.next();

            ModelName modelName = ModelName.valueOf(clintModelName.toUpperCase());
            Car car = carManufactureService.manufactureCar(modelName);

            System.out.println("Model name " + car.getModelName());
            System.out.println("Feature of car " + car.getCarFeatures());

        } catch (IllegalArgumentException e) {
            System.out.println("Please enter valid Model Name!!!!!!!");
        }
    }
}
