package com.example.ResApiProject.controller.student;

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

    public Student(int stud_id, String name) {
        super();
        Stud_id = stud_id;
        this.name = name;
    }
}
