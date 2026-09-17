package com.student;

public class StudentManagement {

    public boolean registerStudent(Student student) {

        return student != null && student.isValid();
    }

    public String getStudentStatus(Student student) {

        if (student == null) {
            return "Invalid Student";
        }

        if (student.isValid()) {
            return "Student Registered Successfully";
        }

        return "Invalid Student Details";
    }

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Rahul",
                20,
                "Software Engineering"
        );

        StudentManagement management = new StudentManagement();

        student.displayStudent();

        System.out.println(
                "Status: " + management.getStudentStatus(student)
        );
    }
}
