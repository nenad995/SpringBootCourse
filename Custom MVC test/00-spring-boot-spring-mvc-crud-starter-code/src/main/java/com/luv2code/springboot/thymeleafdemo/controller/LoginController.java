package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showLoginPage")
    public String showLoginForm() {
        return "login/login-page";
    }

    @GetMapping("/accessDenied")
    public String showAccessDeniedPage() {
        return "login/access-denied";
    }

}
