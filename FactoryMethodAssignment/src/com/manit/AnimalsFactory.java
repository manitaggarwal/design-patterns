package com.manit;

public class AnimalsFactory {
    public static Animals getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        }
        if (animalType.equalsIgnoreCase("Tiger")) {
            return new Tiger();
        }
        return null;
    }
}
