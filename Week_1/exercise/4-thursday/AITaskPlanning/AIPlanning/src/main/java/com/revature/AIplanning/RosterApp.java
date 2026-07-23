package com.revature.AIplanning;

/** Runs a small example of building and evaluating a course roster. */
public class RosterApp {
    public static void main(String[] args) {
        Course course = new Course(3);

        System.out.println("Added Ava: " + course.addStudent(new Student("Ava", 91.5)));
        System.out.println("Added Ben: " + course.addStudent(new Student("Ben", 84.0)));
        System.out.println("Added Chloe: " + course.addStudent(new Student("Chloe", 97.0)));
        System.out.println("Added Devon: " + course.addStudent(new Student("Devon", 88.0)));
        System.out.printf("Course average: %.2f%n", course.calculateAverage());
    }
}
