package com.manit;

class Director {

    void construct(BuilderInterface b) {
        b.buildBody();
        b.addHeadlights();
        b.insertWheels();
    }

}
