package com.manit;

import java.util.Hashtable;

class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /*
     * This is a helper method so that the main class can simply call load cache to get instances of shapes and
     * load them automatically in the hash table.
     * */
    static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
