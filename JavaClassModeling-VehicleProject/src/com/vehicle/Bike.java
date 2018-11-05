package com.vehicle;

class Bike extends Vehicle {


    Bike() {
        type = "cruiser";
        Wheel wheel1 = new Wheel();
        wheel1.setMake("BikeMake1");
        wheels.add(wheel1);

        Wheel wheel2 = new Wheel();
        wheel2.setMake("BikeMake2");
        wheels.add(wheel2);
    }

    void printType() {
        System.out.println("I am " + type);
    }
}
