package com.manit;

/**
 * What is builder interface is responsible for?
 * <p>
 * It is defining the general methods for our concrete classes and also remembering what a director may ask to
 * implement.
 */
public interface BuilderInterface {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}

class Car implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Car body built. ");

    }

    @Override
    public void insertWheels() {
        product.add("Car wheels inserted. ");
    }

    @Override
    public void addHeadlights() {
        product.add("Car headlights added. ");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("MotorCycle body built. ");

    }

    @Override
    public void insertWheels() {
        product.add("MotorCycle wheels inserted. ");
    }

    @Override
    public void addHeadlights() {
        product.add("MotorCycle headlights added. ");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}