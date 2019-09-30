package com.manit;

class FactoryProducer {
     AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else return null;
    }
}
