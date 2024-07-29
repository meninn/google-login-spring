package com.meninn.OAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    // This endpoint is public
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to this endpoint";
    }

    // This endpoint is restricted
    @GetMapping("/restricted-welcome")
    public String restrictedWelcome() {
        return "Welcome to this restricted endpoint";
    }
}
