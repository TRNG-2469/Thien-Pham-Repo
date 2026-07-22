package com.revature.day3lecture;

import java.util.Objects;

// This class represents a Student object in OOP.
public class Student {

    // These are private fields, so data is hidden inside the object.
    private int studentId;
    private String name;
    private String grade;

    // Default constructor: creates an object with no initial values.
    public Student() {
    }

    // Constructor with parameters: used to initialize the object with values.
    public Student(int studentId, String name, String grade) {
        this.studentId = studentId; // 'this' refers to the current object.
        this.name = name;
        this.grade = grade;
    }

    // Getter method: allows other classes to read the studentId.
    public int getStudentId() {
        return studentId;
    }

    // Setter method: allows other classes to update the studentId.
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter for name.
    public String getName() {
        return name;
    }

    // Setter for name.
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade.
    public String getGrade() {
        return grade;
    }

    // Setter for grade.
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Override equals() to compare two Student objects by their values.
    @Override
    public boolean equals(Object obj) {
        // If both references point to the same object, they are equal.
        if (this == obj) {
            return true;
        }
        // If the object is null or is a different class, they are not equal.
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to a Student so we can compare fields.
        Student student = (Student) obj;
        // Two students are equal if all their important fields match.
        return studentId == student.studentId
                && Objects.equals(name, student.name)
                && Objects.equals(grade, student.grade);
    }

    // Override hashCode() so equal objects produce the same hash code.
    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, grade);
    }

    // Override toString() to make the object print in a readable format.
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name='" + name + '\'' + ", grade='" + grade + '\'' + '}';
    }
}
