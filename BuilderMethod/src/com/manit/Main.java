package com.manit;

/**
 * What is builder design pattern doing?
 * <p>
 * Builder design pattern is separating the construction of complex object from its representation.
 */
public class Main {

    public static void main(String[] args) {

        /*
         * What are we doing here?
         *
         * Getting instances of our classes
         * */
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motorCycleBuilder = new MotorCycle();

        /*
        * What are we doing here?
        *
        * Passing an instance of carBuilder (builder interface) to the director to get it constructed.
        * Because director alone knows which methods to call on the builder to get the car constructed.
        * */
        director.construct(carBuilder);
        director.construct(motorCycleBuilder);

        /*
        * Getting the value of the product form the builder and saving it to a new variable.
        * calling a method show() on the product to view the parts that were added by the builder by calling add() method
        * of the product.
        * */
        Product car = carBuilder.getVehicle();
        car.show();
    }
}
