package com.pg;
abstract class Vehicle {
    abstract void start();
}

class Car2 extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

