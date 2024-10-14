package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }

    // Welcome method to handle GET requests at the root URL
    @GetMapping("/hi")
    public String welcome() {
        return "Welcome to the Web Application!";
    }
}
