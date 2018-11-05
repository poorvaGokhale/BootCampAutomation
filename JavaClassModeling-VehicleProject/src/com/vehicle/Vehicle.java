package com.vehicle;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    String type;
    String purpose;
    List<Wheel> wheels=new ArrayList<>();


    abstract void printType();

    void printMake() {
        wheels.forEach(wheel -> System.out.println(wheel.getMake()));
    }

    void iAmShared() {
        System.out.println("Non Abstract Method in Parent Vehicle");
    }

}
