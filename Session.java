package com.university.auth;

import com.university.models.User;

public class Session {

    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public void clear() {
        currentUser = null;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}