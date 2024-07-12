package com.clonesera.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/home")
    public String welcome(){
        return "Welcome!";
    }
    @GetMapping("/user/home")
    public String welcomeUser(){
        return "Welcome, User!";
    }
    @GetMapping("/admin/home")
    public String welcomeAdmin(){
        return "Welcome, Admin!";
    }
}
