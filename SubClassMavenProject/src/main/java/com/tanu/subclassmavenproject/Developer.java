package com.tanu.subclassmavenproject;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("D")
public class Developer extends Employee{
    @Id
    @Column(name = "allowance")
    int Allowance;
    public Developer(int id, String name, int salary,int Allowance) {
        super(id, name, salary);
        this.Allowance = Allowance;
    }
}
