package com.vehicle;

public class Truck extends Vehicle {

    Truck() {
        type = "Mini";
        Wheel wheel1 = new Wheel();
        wheel1.setMake("TruckMake1");
        wheels.add(wheel1);

        Wheel wheel2 = new Wheel();
        wheel2.setMake("TruckMake2");
        wheels.add(wheel2);
    }

    void printType() {
        System.out.println("I am " + type);
    }
}
