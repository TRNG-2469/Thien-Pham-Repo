package com.revature.oopdesign;

public abstract class Vehicle {
    //abstract fields car and truck in same package can use 
    protected String model;
    protected double speed;


 // constructor
 public Vehicle(String model){
    this.model = model;
    this.speed = 0; 


 }
 //absract method stub, sub class will provide implementation not body
public abstract void start();

public abstract void stop();
    
}

