package com.manit;

public class Main {


    /**
     * There is a thread safety problem here, due to race conditions.
     * If a new request is sent by the program to instantiate a singleton object, we would have two objects.
     * This is very rare but sometimes extremely hard to debug.
     *
     * @param args
     * @author Manit Aggarwal
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setData(4);
        System.out.println("singleton instance first invocation = " + s1);
        System.out.println("s1.getData() = " + s1.getData());


        Singleton s2 = Singleton.getInstance();
        System.out.println("singleton instance second invocation = " + s2);
        System.out.println("s2.getData() = " + s2.getData());

        Singleton s3 = Singleton.getInstance();
        s3.setData(55);
        System.out.println("singleton instance third invocation = " + s3);
        System.out.println("s3.getData() = " + s3.getData());

    }
}
