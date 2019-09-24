package com.manit;

public class Main {

    public static void main(String[] args) {
        /*
        * What I can learn is that basically factory method gives us concise way of creation new instances of classes
        * through use of interfaces and factories
        *
        * @author Manit Aggarwal
        * */

        Animals tiger = AnimalsFactory.getAnimal("tiger");
        tiger.walk();
    }
}
