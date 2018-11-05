package com.vehicle;

public class Main {
    public static void main(String[] args) {

/*        Vehicle vehicle1 = new Vehicle();
        vehicle1.printType();*/

        Bike bike1 = new Bike();
        bike1.printType();
        bike1.printMake();

        Car car1 = new Car();
        car1.printType();
        car1.printMake();

        Truck truck1 = new Truck();
        truck1.printType();
        truck1.iAmShared();
        truck1.printMake();


        Vehicle v2 = new Car();
        //   Car c2 = new Vehicle(); not feasible as Child cant refer to parent object but Child object can be referred by parent Object
        v2.printType();
        ((Car) v2).carOnly();
        v2.iAmShared();
        v2.printMake();

    }
}
