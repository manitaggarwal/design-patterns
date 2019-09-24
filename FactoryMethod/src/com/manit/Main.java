package com.manit;

public class Main {

    public static void main(String[] args) {

        /*
         * Essentially calling factoryMethod() will also serve that same purpose, but we call the public method from
         * the abstract class which our factory has implemented, which contains the public method having abstract method.
         * Like this would work ----->  Shape shape = new CircleFactory().factoryMethod();
         * */
        Shape shape = new CircleFactory().getShape();
        shape.draw();
    }
}
/*
 * What is happening here?
 * My observations:
 * 1. We can change the name of the method factoryMethod() in abstract shape factory class any number of times and our code will
 * not break, as we would be using that public method getShape() from our abstract class which as already implemented by all
 * of our concrete classes.
 * */

/*
 * Other Notes :
 * This is one of the strictest way of implementing factory method, as originally intended.
 * */