package com.manufacture;

public class Utils {

    public static boolean checkNumberOfGear(int numberOfGear) throws IllegalArgumentException{
        if (numberOfGear > 0 && numberOfGear < 7) {
            return true;
        } else {
            throw new IllegalArgumentException("Number of gear is unavailable");
        }
    }
}
