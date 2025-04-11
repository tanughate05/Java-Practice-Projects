package com.example.Simpleform.controller.Repositry;

import com.example.Simpleform.controller.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositry extends JpaRepository<Student, Integer> {

}
