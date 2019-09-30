package com.manit;

public class Main {

    public static void main(String[] args) {

        /*
         * Here factory producer method to get is factory is not static, so we have to first get a instance of the class
         * and then call a method on it.
         * */
        FactoryProducer factoryProducer = new FactoryProducer();

        /*
         * How is abstract factory method different form factory method?
         * It is providing an interface for creating families of related or dependent objects without specifying their
         * concrete class.
         * Abstract family has now the ability to create a complete two families of objects, in our case shape and
         * color factory.
         *
         * @author Manit Aggarwal
         * */
        AbstractFactory colorFactory = factoryProducer.getFactory("color");
        if (colorFactory != null) {
            Color color = colorFactory.getColor("red");
            if (color != null) {
                color.fill();
            } else System.out.println("color not found");
        } else System.out.println("factory type not found");

        AbstractFactory shapeFactory = factoryProducer.getFactory("shape");
        if (shapeFactory != null) {
            Shape shape = shapeFactory.getShape("square");
            if (shape != null) {
                shape.draw();
            } else System.out.println("shape not found");
        } else System.out.println("factory not found");
    }
}
