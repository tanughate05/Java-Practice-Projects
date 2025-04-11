package com.example.SpringDemoProject2.Controller;

import java.util.List;


import com.example.SpringDemoProject2.Controller.Repository.StudentRepository;
import com.example.SpringDemoProject2.Controller.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DataController {
    @Autowired
    StudentRepository repo;

    @PostMapping("/student")
    public String addStudent(@RequestParam(name="studentid") int id,@RequestParam(name="studentname")String stName) {
        System.out.println(id+ ""+stName);
        Student s1=new Student(id,stName);
        repo.save(s1);
        return "Data added";
    }
    @GetMapping("/student")
    public List<Student>getAllStudents() {
        return repo.findAll();

    }

    @GetMapping("/StudentbyId")
    public Student getStudById() {
        return repo.findById(1).get();
    }
}
