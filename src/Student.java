package com.university.usermanagement;

public class Student extends com.university.usermanagement.User {
    private String studentId;
    private String major;

    public Student(String username, String password, String email, String studentId, String major) {
        super(username, password, email);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Student Info ===");
        System.out.println("Username: " + getUsername());


        System.out.println("Email: " + getEmail());
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

