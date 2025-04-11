package com.example.VisitorsFrom.controller.Repositry;

import com.example.VisitorsFrom.controller.visitor.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.sql.Time;

public interface VisitorRepositry extends JpaRepository<Visitor, Integer> {
}
