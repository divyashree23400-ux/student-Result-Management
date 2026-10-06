package com.studentResultManagement.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StudentResultTest {

    StudentResult studentResult = new StudentResult();
    @Test
    void testCalculateAverage() {
        double average = studentResult.calculateAverage(85, 90, 80);

        assertEquals(85.0, average);
    }
    @Test
    void testCalculateGrade() {
        String grade = studentResult.calculateGrade(85);

        assertEquals("B", grade);
    }
    @Test
    void testIsPass() {
        boolean result = studentResult.isPass(85);

        assertTrue(result);
    }
    @Test
    void testIsFail() {
        boolean result = studentResult.isPass(45);

        assertFalse(result);
    }
}