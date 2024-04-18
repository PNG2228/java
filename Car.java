package com.pg;
public class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method
    public void drive() {
        System.out.println("Driving the " + year + " " + make + " " + model);
    }
}
