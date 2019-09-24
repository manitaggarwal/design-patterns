package com.manit;

public abstract class AbstractShapeFactory {
    abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory {

    @Override
    Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {

    @Override
    Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {

    @Override
    Shape factoryMethod() {
        return new Circle();
    }
}