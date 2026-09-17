package com.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagementTest {

    @Test
    public void testValidStudent() {

        Student student = new Student(
                101,
                "Rahul",
                20,
                "Software Engineering"
        );

        StudentManagement management = new StudentManagement();

        assertTrue(management.registerStudent(student));
    }

    @Test
    public void testInvalidStudentAge() {

        Student student = new Student(
                102,
                "Aman",
                15,
                "Computer Science"
        );

        StudentManagement management = new StudentManagement();

        assertFalse(management.registerStudent(student));
    }

    @Test
    public void testStudentStatus() {

        Student student = new Student(
                103,
                "Priya",
                21,
                "Information Technology"
        );

        StudentManagement management = new StudentManagement();

        assertEquals(
                "Student Registered Successfully",
                management.getStudentStatus(student)
        );
    }
}
       
       
