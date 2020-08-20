package com.manufacture;

import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;

import java.util.Scanner;

public class ManufacturerMain {

    public static void main(String[] args) {

        CarManufactureService carManufactureService = new CarManufactureService();
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Welcome To Car Manufacture Service");
        System.out.println("Choose your car model :");
        System.out.println("1. FERRARI");
        System.out.println("2. TATA");
        System.out.println("3. TESLA");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                car = carManufactureService.manufactureCar(ModelName.FERRARI);
                break;
            case 2:
                car = carManufactureService.manufactureCar(ModelName.TATA);
                break;
            case 3:
                car = carManufactureService.manufactureCar(ModelName.TESLA);
                break;
            default:
                System.out.println("Please enter valid Model Name!!!!!!!");
                flag = false;

        }

        if (flag)
            System.out.println("Car Manufactured with Model Name : " + car.getModelName() + "\twith feature: " + car.getCarFeatures());
    }
}
