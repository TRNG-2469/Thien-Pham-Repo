package com.revature.oopdesign;

public interface Driveable {
    // abstract method stub, sub class will provide implementation not body
    void accelerate();

    // a class can use it or overide it 
    default void soundHorn(){
        System.out.println("Beep beep!");
    }



    
}