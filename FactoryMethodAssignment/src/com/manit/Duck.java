package com.manit;

public class Duck implements Animals {

    @Override
    public void walk() {
        System.out.println("Duck is walking. ");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating. ");
    }
}
