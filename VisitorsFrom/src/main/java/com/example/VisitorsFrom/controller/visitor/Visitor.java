package com.example.VisitorsFrom.controller.visitor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Visitor")

public class Visitor {

    @Id
    @Column(name="visitid")
    int visitid;
    @Column(name="visitname")
    String name;
    @Column(name="visitcity")
    String city;

    @Column(name="visitEmail")
    String email;


    @Column(name="visitNumber")
    String number;

    @Column(name="visitDate")
    LocalDate date;

    @Column(name="visitTime")
    LocalTime time;

    public Visitor() {

    }



    public int getVisitid() {
        return visitid;
    }

    public void setVisitid(int visitid) {
        this.visitid = visitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }




    public Visitor(int visitid, String name, String city, String email,String number, LocalDate date, LocalTime time) {
        this.visitid = visitid;
        this.name = name;
        this.city = city;
        this.email = email;
        this.number = number;
        this.date = date;
        this.time = time;
    }



}
