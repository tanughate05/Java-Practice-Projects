#include<stdio.h>
void main()
{
    double basicSalary = 60000;
    double da,tr,hra, totalSalary;

    // check if the salary is greater then or not
    if(basicSalary <= 50000)
    {
        da = basicSalary * 0.1;
        tr = basicSalary * 0.2;
        hra = basicSalary * 0.25;
       
    } 
    else
    {
        da = basicSalary * 0.15;
        tr = basicSalary * 0.25;
        hra = basicSalary * 0.3;
   
    }
    totalSalary = basicSalary + da + tr + hra;
    printf("The total salary",totalSalary);
}