package com.revature.oopdesign;
//car class inherit from vehicle class and implement driveable interface 
public class Car extends Vehicle implements Driveable{

    public Car(String model){
        //constructor channing using methods and field of vehicles
        super(model);

    }

    // car is providing it own implementation of the abstract method 
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    // car provide it own inplementation of the abstract method in driveable interface
    @Override
    public void accelerate() {
        speed += 20.0;
        System.out.println(model + " car accelerated to " + speed + " mph.");
}
    @Override
    public void stop() {
        speed = 0.0;
        System.out.println(model + " car has stopped.");
    }



    
}
