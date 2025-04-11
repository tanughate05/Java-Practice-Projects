package com.example.VisitorsFrom.controller;


import com.example.VisitorsFrom.controller.Repositry.VisitorRepositry;
import com.example.VisitorsFrom.controller.visitor.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController

public class DataController {
    @Autowired
    VisitorRepositry repo;


    @PostMapping("/visitor")
    public String addVisitor(@RequestParam(name="visitorid") int visitid,
                             @RequestParam(name="visitorname") String visitName,
                             @RequestParam(name="visitorcity") String visitCity,
                             @RequestParam(name="visitoremail") String visitEmail,
                             @RequestParam("visitornumber") String visitNumber,
                             @RequestParam("visitordate") String visitDate,
                             @RequestParam(name="visitortime") String visitTime,  Model model)
    {
        LocalDate visitDates = LocalDate.parse(visitDate);
        LocalTime visitTimes = LocalTime.parse(visitTime);
        System.out.println("done");
        Visitor s1=new Visitor(visitid,visitName,visitCity,visitEmail, visitNumber,visitDates,visitTimes);
        repo.save(s1);
       return "data entered";
    }

    @GetMapping("/visitor")

    public List<Visitor> getAllVisitors() {

        return repo.findAll();
    }
}
