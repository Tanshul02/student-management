package com.student;

public class StudentManagement {

    public boolean registerStudent(Student student) {
        return student != null && student.isValid();
    }

    public String getStudentStatus(Student student) {
        if (registerStudent(student)) {
            return "Student Registered Successfully";
        }

        return "Student Registration Failed";
    }
}
