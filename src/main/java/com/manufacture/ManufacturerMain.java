package com.manufacture;

import com.manufacture.interfaces.NewCarModel;
import com.manufacture.model.Ferrari;
import com.manufacture.model.Tata;
import com.manufacture.model.Tesla;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManufacturerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        String color = "";
        String fuelType = "";
        int numberOfGear = 0;
        NewCarModel car = null;

        System.out.println("Welcome To Car Manufacture Service");
        System.out.println("Choose your car model :");
        System.out.println("1. FERRARI");
        System.out.println("2. TATA");
        System.out.println("3. TESLA");
        int choice = scanner.nextInt();
        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter the Color(String value) :");
                    color = scanner.next();
                    System.out.println("Enter the Type Of Fuel(String value) :");
                    fuelType = scanner.next();
                    System.out.println("Enter the Number Of Gear(Integer value) :");
                    numberOfGear = scanner.nextInt();
                    car = new Ferrari(color, fuelType, numberOfGear);
                    break;
                case 2:
                    System.out.println("Enter the Color(String value) :");
                    color = scanner.next();
                    System.out.println("Enter the Type Of Fuel(String value) :");
                    fuelType = scanner.next();
                    System.out.println("Enter the Number Of Gear(Integer value) :");
                    numberOfGear = scanner.nextInt();
                    car = new Tata(color, fuelType, numberOfGear);
                    break;
                case 3:
                    System.out.println("Enter the Color(String value) :");
                    color = scanner.next();
                    System.out.println("Enter the Type Of Fuel(String value) :");
                    fuelType = scanner.next();
                    System.out.println("Enter the Number Of Gear(Integer value) :");
                    numberOfGear = scanner.nextInt();
                    car = new Tesla(color, fuelType, numberOfGear);
                    break;
                default:
                    System.out.println("Please enter valid Choice!!!!!!!");
                    flag = false;
            }

            if (flag) {
                car.modelName();
                car.hasAbilities();
                car.hasColor();
                car.hasFuelType();
                car.hasNumberOfGears();
            }
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Please enter valid input !!!!!");
        }
    }
}
