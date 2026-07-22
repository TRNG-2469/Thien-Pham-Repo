package com.revature.wednesday;

public class RosterApp {
    public static void main(String[] args) {
        String[] studentNames = new String[5];
        studentNames[0] = "Alice";
        studentNames[1] = "Bob";

        for (String studentName : studentNames) {
            if (studentName != null && !studentName.isBlank() && studentName.startsWith("A")) {
                System.out.println("Student: " + studentName);
            }
        }
    }
}