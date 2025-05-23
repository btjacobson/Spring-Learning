package com.example.todo_app.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean validUsername = username.equalsIgnoreCase("test");
        boolean validPassword = password.equals("test2");

        return validUsername && validPassword;
    }
}
