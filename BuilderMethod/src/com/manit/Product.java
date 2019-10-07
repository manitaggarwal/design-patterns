package com.manit;

import java.util.LinkedList;

class Product {

    private LinkedList<String> parts;

    Product() {
        parts = new LinkedList<>();
    }

    void add(String s) {
        parts.addLast(s);
    }

    void show() {
        System.out.println("Product complete as below. ");
        for (String part : parts) {
            System.out.println("part = " + part);
        }
    }
}
