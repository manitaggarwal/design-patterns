package com.manit;

public abstract class Shape implements Cloneable {

    String type;
    private String id;

    abstract void draw();

    String getType() {
        return type;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape {

    Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside rectangle draw method. ");
    }
}

class Square extends Shape {

    Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside square draw method. ");
    }
}

class Circle extends Shape {

    Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside circle draw method. ");
    }
}