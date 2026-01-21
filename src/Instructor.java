package com.university.usermanagement;

public class Instructor extends User {
    private String instructorId;
    private String department;

    public Instructor(String username, String password, String email, String instructorId, String department) {
        super(username, password, email);
        this.instructorId = instructorId;
        this.department = department;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Instructor Info ===");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Department: " + department);
    }
}


