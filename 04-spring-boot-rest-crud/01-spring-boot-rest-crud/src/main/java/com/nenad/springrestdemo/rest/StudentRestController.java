package com.nenad.springrestdemo.rest;

import com.nenad.springrestdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("Nenad", "Kostov"));
        students.add(new Student("Milica", "Stefanov"));
        students.add(new Student("Milos", "Zlatkovic"));
    }

    @GetMapping("/students")
    public List<Student> getListOfStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student findById(@PathVariable int studentId) {
        if ((studentId >= students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student with ID: " + studentId + " not found");
        }

        return students.get(studentId);
    }
}
