package in.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/public/hello")
    public String publicHello() {
        return "Hello, this is a public endpoint!";
    }

    @GetMapping("/api/home")
    public String secureHello() {
        return "Welcome, authenticated user!";
    }
    @GetMapping("/api/userinfo")
    public String getUserInfo() {
        return "User info: You are successfully authenticated!";
    }

    @GetMapping("/api/dashboard")
    public String getDashboardData() {
        return "Dashboard data fetched successfully!";
    }
}

