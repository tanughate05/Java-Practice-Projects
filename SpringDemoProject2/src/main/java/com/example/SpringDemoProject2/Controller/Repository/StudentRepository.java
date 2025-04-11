package com.example.SpringDemoProject2.Controller.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringDemoProject2.Controller.student.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

    public List<Student> findByName(String name);

    //@Query("select stname from Student",nativeQuery=true)
    //public  list<Object[]>cutomQuery();
    @Query("select name from Student")
    public List<Student> customQuery();



}