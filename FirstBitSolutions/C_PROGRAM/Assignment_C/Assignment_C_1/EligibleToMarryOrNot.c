//Q6: Write a program to check if person is eligible to marry or not(male age>=21 and female age>=18)?
#include<stdio.h>
void main()
{
    char gender = 'f';
    int age = 20;

    if((gender =='f' && age >= 18)||(gender =='m' && age >= 21))
    {
        printf("Person is eligible to marry");
    }
    else
    {
        printf("Person is not eligible to marry");
    }
}