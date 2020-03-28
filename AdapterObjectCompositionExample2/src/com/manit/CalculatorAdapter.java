package com.manit;

public class CalculatorAdapter implements Calculator {

    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        Calculator calculator = new CalculatorImpl();
        Rectangle rectangle = new Rectangle();
        rectangle.length = triangle.base;
        rectangle.width = 0.5 * triangle.height;
        return calculator.getArea(rectangle);
    }
}
