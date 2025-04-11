package com.example.SpringProjectTleaf1.controller;

import com.example.SpringProjectTleaf1.controller.Repository.StudentRepository;
import com.example.SpringProjectTleaf1.controller.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



    @Controller
    public class DataController {
        @Autowired
        StudentRepository repo;

        @PostMapping("/student")
        public String addStudent(@RequestParam(name="studentid") int id, @RequestParam(name="studentname")String stName) {
            System.out.println(id+ ""+stName);
            Student s1=new Student(id,stName);
            repo.save(s1);
            return "Data added";
        }
        @GetMapping("/student")
        public  String searchAll(Model model) {
            List<Student> data = repo.findAll();
            model.addAttribute("key",data);
            return "output.html";

        }

        @GetMapping("/student/{id}")
        public Student getStudById( @PathVariable int id) {
            return repo.findById(1).get();
        }
    }

