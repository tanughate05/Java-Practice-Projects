package com.example.ResApiProject.controller;

import com.example.ResApiProject.controller.Repositry.StudentRepository;
import com.example.ResApiProject.controller.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
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
    public List<Student> getAllStudents() {

        return repo.findAll();
    }

    @GetMapping("/recieve")
    public int recieveMessage() {
        String url = "http://localhost:8080/student";

        RestTemplate template = new RestTemplate();
      List<?>  value = template.getForEntity(url, List.class).getBody();

         int counts = value.size();
         return counts;



    }
}
