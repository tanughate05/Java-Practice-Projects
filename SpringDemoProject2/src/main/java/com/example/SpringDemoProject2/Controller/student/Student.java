package com.example.SpringDemoProject2.Controller.student;


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

    public Student(int stud_id, String name) {
        super();
        Stud_id = stud_id;
        this.name = name;
    }

    /**
     * @return the stud_id
     */
    public int getStud_id() {
        return Stud_id;
    }

    /**
     * @param stud_id the stud_id to set
     */
    public void setStud_id(int stud_id) {
        Stud_id = stud_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }



}
