package com.example.Simpleform.controller;

import com.example.Simpleform.controller.Repositry.StudentRepositry;
import com.example.Simpleform.controller.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class DataController {

   @Autowired
    StudentRepositry rep;

    @PostMapping("/student")
    public String addStudent(@RequestParam(name="studentid") int id, @RequestParam(name="studentname")String stName,@RequestParam(name="studentage") int age) {
        System.out.println("done");
        Student s1=new Student(id,stName,age);
        rep.save(s1);
        return "Data added";
    }
    @GetMapping("/student")
    public List<Student> getAllStudents() {

        return rep.findAll();
    }
}
