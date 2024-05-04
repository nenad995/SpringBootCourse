package com.nenad.thymeleafdemo.controller;

import com.nenad.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    //Injection of comma delimited list (countries) from application.properties
    @Value("${countries}")
    private List<String> countries;

    //Injection of comma delimited list (programmingLanguages) from application.properties
    @Value("${programmingLanguages}")
    private List<String> programmingLanguages;

    //Injection of comma delimited list (operatingSystems) from application.properties
    @Value("${operatingSystems}")
    private List<String> operatingSystems;

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
        //Create new Student obj
        Student theStudent = new Student();
        //Add it to the model
        model.addAttribute("student", theStudent);
        //Add countries list to the model. This attribute will be used in the form
        model.addAttribute("countries", countries);
        //Add programmingLanguages list to the model. This attribute will be used in the form
        model.addAttribute("programmingLanguages", programmingLanguages);
        //Add operatingSystems list to the model. This attribute will be used in the form
        model.addAttribute("operatingSystems", operatingSystems);
        //Return HTML template
        return "show-student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        System.out.println(student);
        return "student-confirmation";
    }

}
