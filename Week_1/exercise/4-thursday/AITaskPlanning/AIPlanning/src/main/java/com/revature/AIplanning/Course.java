package com.revature.AIplanning;

/** Stores a fixed-size roster of students for one course. */
public class Course {
    private final Student[] roster;
    private int count;

    public Course(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Course capacity cannot be negative.");
        }

        roster = new Student[capacity];
    }

    /**
     * Adds a student if a position remains in the roster.
     *
     * @return true when the student was added; false when the roster is full
     */
    public boolean addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (count >= roster.length) {
            return false;
        }

        roster[count] = student;
        count++;
        return true;
    }

    public double calculateAverage() {
        if (count == 0) {
            return 0.0;
        }

        double total = 0;
        for (int index = 0; index < count; index++) {
            total += roster[index].getScore();
        }

        return total / count;
    }
}
