package com.example.Simpleform.controller.student;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")

public class Student {

    @Id
    @Column(name="stdid")
    int Stud_id;
    @Column(name="stname")
    String name;

    @Column(name="stage")
    int age;

    public Student() {

    }

    public int getStud_id() {
        return Stud_id;
    }

    public void setStud_id(int stud_id) {
        Stud_id = stud_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int stud_id, String name,int age) {
        super();
        Stud_id = stud_id;
        this.name = name;
        this.age=age;

    }


}
