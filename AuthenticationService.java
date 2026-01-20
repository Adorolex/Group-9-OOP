package com.university.auth;

import com.university.models.User;
import com.university.models.UserManager;

public class AuthenticationService {

    private UserManager userManager;
    private Session session;

    public AuthenticationService(UserManager userManager) {
        this.userManager = userManager;
        this.session = new Session();
    }

    public boolean login(String username, String password) {
        User user = userManager.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            session.setCurrentUser(user);
            return true;
        }
        return false;
    }

    public void logout() {
        session.clear();
    }

    public User getCurrentUser() {
        return session.getCurrentUser();
    }
}