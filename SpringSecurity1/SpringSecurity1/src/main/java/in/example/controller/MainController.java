package in.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
    @ResponseBody
    public String homePage() {
        return "Welcome to the Public Home Page! 🚀 (No login required)";
    }

    @GetMapping("/user")
    @ResponseBody
    public String userPage() {
        return "Hello, User! 🔒 You are logged in successfully.";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminPage() {
        return "Welcome to the Admin Dashboard! 👑 (Only for ADMIN role)";
    }

//    @GetMapping("/login")
//    @ResponseBody
//    public String loginPage() {
//        return "Please login using your username and password.";
//    }
}
