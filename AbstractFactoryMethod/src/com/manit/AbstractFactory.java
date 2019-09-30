package com.manit;

abstract class AbstractFactory {
    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }

    // TODO: 30-09-2019 figure out what Jason was talking about here?
    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("green")) {
            return new Green();
        }
        if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else {
            return null;
        }
    }
}