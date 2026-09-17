package com.student;

public class Student {

    private int studentId;
    private String name;
    private int age;
    private String department;

    public Student(int studentId, String name, int age, String department) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isValid() {
        return studentId > 0
                && name != null
                && !name.trim().isEmpty()
                && age >= 17
                && department != null
                && !department.trim().isEmpty();
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}
