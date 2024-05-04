package com.nenad.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormNameToUpperCase(HttpServletRequest request, Model model){
        String studentName = request.getParameter("studentName");
        model.addAttribute("studentNameUpperCase", studentName.toUpperCase());
        return "helloworld";
    }

    @PostMapping("/processFormVersionThree")
    public String processFormWithRequestParam(@RequestParam("studentName") String studentName, Model model){
        model.addAttribute("studentNameUpperCase", studentName.toUpperCase());
        return "helloworld";
    }

}
