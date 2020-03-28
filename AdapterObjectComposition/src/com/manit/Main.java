package com.manit;

public class Main {

    public static void main(String[] args) {

        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        /*
         * We are calling the methods of Duck interface but the adapter is converting those methods to the
         * methods of turkey interface, so here a "a short distance is added to the flying"
         * */
        turkeyAdapter.fly();

        /*
         * Even though we are calling a quack method on the Duck interface, adapter is converting it to
         * the gobble method of the turkey interface.
         * */
        turkeyAdapter.quack();

    }
}
