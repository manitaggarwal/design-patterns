package com.manit;

public class Main {

    public static void main(String[] args) {
        /*
         * Instead of making and calling different classes extending the factory class, we can now call the static
         * getShape() method of the abstract class to the the desired result.
         * This is not the strict implementation of factory method but, it is most widely used.
         *
         * @author Manit Aggarwal
         * */
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
    }
}
