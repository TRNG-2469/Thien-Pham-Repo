package com.revature.day3lecture;

// This class manages Student objects and contains the main method.
public class StudentManager {

    // The main method is the entry point of the Java program.
    public static void main(String[] args) {
        // Create the first Student object using the constructor.
        Student student1 = new Student(101, "Alice", "A");
        // Create the second Student object with the same values.
        Student student2 = new Student(101, "Alice", "A");

        // Print the objects using toString().
        System.out.println("student1: " + student1);
        System.out.println("student2: " + student2);
        // Compare the two objects using equals().
        System.out.println("student1 equals student2? " + student1.equals(student2));
        // Print the hash codes for both objects.
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
    }
}
