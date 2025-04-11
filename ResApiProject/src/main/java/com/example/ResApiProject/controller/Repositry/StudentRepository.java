package com.example.ResApiProject.controller.Repositry;

import com.example.ResApiProject.controller.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public  interface StudentRepository extends JpaRepository<Student, Integer> {
}
