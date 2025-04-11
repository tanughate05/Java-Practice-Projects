#include"Employe.h"
#include<iostream>
using namespace std;

Node::Node()
{
      
       next = NULL;
}
struct Employee* Node::setData(int id,char * n ,char* a)
{
    Employee * newEmp = new newEmp;
     newEmp->Emp_id = id;
     newEmp->Emp_name= n;
     newEmp->Emp_address=a;
     newEmp->next = nullptr;
     return newEmp; 
   
}
void Node::setNext(struct Employee* _next)
{
    next = _next;
}

struct Employee Node:: getData()
{
    return data;
}
struct Employee* Node::getNext()
{
    return next;
}