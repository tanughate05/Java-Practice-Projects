#include <iostream>
#include <string.h>
#include <cstdlib>

#include "Student.h"

using namespace std;


int main()
{
    Student student1;
    student1.SetNameAge("John Doe",20);
    student1.PrintNameAge();
    
    return 0;
}