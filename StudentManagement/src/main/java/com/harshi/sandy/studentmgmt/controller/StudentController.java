package com.harshi.sandy.studentmgmt.controller;

import com.harshi.sandy.studentmgmt.model.Student;
import com.harshi.sandy.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> hello() {
        return studentService.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping
    public void delete(@RequestBody Student student){
        studentService.delete(student);
    }


}
