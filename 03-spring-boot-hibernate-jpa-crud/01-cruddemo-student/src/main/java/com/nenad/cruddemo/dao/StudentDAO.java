package com.nenad.cruddemo.dao;

import com.nenad.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);
    Student findById(Long studentId);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student student);
    void delete(Long studentId);
    int deleteAllStudents();

}
