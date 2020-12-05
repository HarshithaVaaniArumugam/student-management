package com.harshi.sandy.studentmgmt.controller;

import com.harshi.sandy.studentmgmt.model.Student;
import com.harshi.sandy.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> hello() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping
    public void delete(@RequestBody Student student){
        studentRepository.delete(student);
    }


}
