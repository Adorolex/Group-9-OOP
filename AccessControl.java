package com.university.auth;

import com.university.models.User;

public class AccessControl {

    public boolean canEnroll(User user) {
        return user != null && user.getRole().equals("STUDENT");
    }

    public boolean canAssignGrade(User user) {
        return user != null && user.getRole().equals("INSTRUCTOR");
    }

    public boolean isAdmin(User user) {
        return user != null && user.getRole().equals("ADMIN");
    }
}