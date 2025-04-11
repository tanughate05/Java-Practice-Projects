package com.tanu.subclassmavenproject;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("M")
public class Manager extends Employee{

    @Id
    @Column(name = "target")
    int target;

    public Manager(int id, String name, int salary, int target) {
        super(id, name, salary);
        this.target = target;
    }
}
