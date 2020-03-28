package com.manit;

public class CalculatorImpl implements Calculator {

    @Override
    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
