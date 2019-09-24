package com.manit;

public class Tiger implements Animals {

    @Override
    public void walk() {
        System.out.println("Tiger is walking towards you. ");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is going to eat you. ");
    }
}
