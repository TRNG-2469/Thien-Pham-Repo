package com.revature.wednesday;

public class FinancialApp {
    public static double computeScore(int totalScore, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return (double) totalScore / divisor;
    }

    public static void main(String[] args) {
        System.out.println("Processing report...");
        try {
            double value = computeScore(100, 0);
            System.out.println("Calculated Value: " + value);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}