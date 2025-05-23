package com.example.todo_app.controllers;

import com.example.todo_app.services.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String welcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(username, password)) {
            model.put("username", username);

            return "welcome";
        }

        model.put("errorMessage", "Invalid credentials");
        return "login";
    }
}
