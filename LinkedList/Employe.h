//structure of Employee

#include<iostream>
using namespace std;
#pragma once
class Employee
{ 
    int Emp_id;
    char Emp_name [8];
    char Emp_address[20];

};

class Node{
     
     struct Employee data;

    struct Employee * next;
   public:
     Node();
     struct Employee* setData(int,char*,char*);
     void setNext(struct Employee *);

     struct Employee getData();
     struct Employee *getNext();

};