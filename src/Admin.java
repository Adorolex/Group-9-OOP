 package com.university.usermanagement;

public class Admin extends com.university.usermanagement.User {
    private String adminId;
    private String role;

    public Admin(String username, String password, String email, String adminId, String role) {
        super(username, password, email);
        this.adminId = adminId;
        this.role = role;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Admin Info ===");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Admin ID: " + adminId);
        System.out.println("Role: " + role);
    }
}









