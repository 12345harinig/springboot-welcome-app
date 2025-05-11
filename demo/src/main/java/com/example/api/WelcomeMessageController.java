package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {

    @GetMapping("/api/welcomeMessage")
    public String getWelcomeMessage() {
        return "Welcome from the Spring Boot Backend!";
    }
}
