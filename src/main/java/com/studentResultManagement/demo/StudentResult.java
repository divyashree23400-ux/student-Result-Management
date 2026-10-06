package com.studentResultManagement.demo;

public class StudentResult {

    public double calculateAverage(int mark1, int mark2, int mark3) {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else if (average >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public boolean isPass(double average) {
        return average >= 50;
    }
}