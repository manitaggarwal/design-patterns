package com.manit;

class Singleton {

    private static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {
    }

    /**
     * As we have made the constructor private, only way to get an instance of this class would be through the
     * getInstance method, which will check and instantiate singleton class only if it has not been instantiated before.
     *
     * @return a unique instance of Singleton class
     * @author Manit Aggarwal
     */
    static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
            return uniqueInstance;
        } else return uniqueInstance;
    }
    void setData(int i) {
        data = i;
    }

    int getData() {
        return data;
    }


}
