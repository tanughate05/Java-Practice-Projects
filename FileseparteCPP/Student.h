#include<iostream>
#include<cstdlib>
#include<string.h>

using namespace std;

class Student
{
    public :
        Student();
        void SetNameAge(string name,int age);
        void PrintNameAge();
    private:
    string studentName;
    int studentAge;
};