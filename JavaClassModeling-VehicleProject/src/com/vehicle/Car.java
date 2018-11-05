package com.vehicle;

public class Car extends Vehicle {
    Car() {
        type = "SUV";
        Wheel wheel1 = new Wheel();
        wheel1.setMake("CarMake1");
        wheels.add(wheel1);

        Wheel wheel2 = new Wheel();
        wheel2.setMake("CarMake2");
        wheels.add(wheel2);

        Wheel wheel3 = new Wheel();
        wheel3.setMake("CarMake3");
        wheels.add(wheel3);

        Wheel wheel4 = new Wheel();
        wheel4.setMake("CarMake4");
        wheels.add(wheel4);
    }



    void printType() {
        System.out.println("I am " + type);
    }
    void carOnly() {
        System.out.println("I am only Car Method");
    }
}
