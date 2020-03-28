package com.manit;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(20, 10);
        Calculator calculator = new CalculatorAdapter(triangle);
        System.out.println(calculator.getArea(null));

    }
}
