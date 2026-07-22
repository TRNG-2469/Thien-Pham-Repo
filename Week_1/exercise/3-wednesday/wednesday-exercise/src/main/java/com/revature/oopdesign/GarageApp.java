package com.revature.oopdesign;

public class GarageApp {

    public static void main(String[] args) {

        Car car = new Car("Honda Civic");
        Truck truck = new Truck("Ford F-150");

        car.start();
        car.accelerate();
        car.soundHorn();
        car.stop();

        System.out.println();

        truck.start();
        truck.accelerate();
        truck.soundHorn();
        truck.stop();
    }
}