package com.manufacture;

import com.manufacture.enums.Ability;
import com.manufacture.enums.ModelName;
import com.manufacture.service.ManufactureCar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManufacturerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        String color = "";
        String fuelType = "";
        int numberOfGear = 0;
        ManufactureCar manufactureCar = null;

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
                    manufactureCar = new ManufactureCar(ModelName.FERRARI, Ability.TO_FLY, color, fuelType, numberOfGear);
                    break;
                case 2:
                    System.out.println("Enter the Color(String value) :");
                    color = scanner.next();
                    System.out.println("Enter the Type Of Fuel(String value) :");
                    fuelType = scanner.next();
                    System.out.println("Enter the Number Of Gear(Integer value) :");
                    numberOfGear = scanner.nextInt();
                    manufactureCar = new ManufactureCar(ModelName.TESLA, Ability.TO_RUN_ON_BATTERY, color, fuelType, numberOfGear);
                    break;
                case 3:
                    System.out.println("Enter the Color(String value) :");
                    color = scanner.next();
                    System.out.println("Enter the Type Of Fuel(String value) :");
                    fuelType = scanner.next();
                    System.out.println("Enter the Number Of Gear(Integer value) :");
                    numberOfGear = scanner.nextInt();
                    manufactureCar = new ManufactureCar(ModelName.TATA, Ability.TO_PULL, color, fuelType, numberOfGear);
                    break;
                default:
                    System.out.println("Please enter valid Choice!!!!!!!");
                    flag = false;
            }

            if (flag) {
                System.out.println("Car Manufactured !!!! " +
                        "\n Model Name : " + manufactureCar.modelName() +
                        "\n Feature : " + manufactureCar.hasAbility() +
                        "\n Color : " + manufactureCar.modelColor() +
                        "\n Fuel type : " + manufactureCar.fuelType() +
                        "\n Number Of Gears : " + manufactureCar.numberOfGear());
            }
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Please enter valid input !!!!!");
        }
    }
}
