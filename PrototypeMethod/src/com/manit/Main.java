package com.manit;

public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        /*
        * What is happening here? And why?
        *
        * Once the cache is loaded by our helper ShapeCache class, we can get cloned objects without calling the new
        * method on the concrete shape classes. This is done because in java instantiation of new classes is considered
        * a costly affair.
        * */
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("clonedShape.getType() = " + clonedShape.getType());
    }
}
