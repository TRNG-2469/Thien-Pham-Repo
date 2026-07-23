package com.revature.AIplanning;

/** Represents one student and the score they earned in a course. */
public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative.");
        }

        this.score = score;
    }
}
