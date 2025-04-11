//Q3:Accept a 3 digit  number from user and find the sum of digits and also reverse the number?
#include<stdio.h>
void main()
{
    int number = 123;
    int sum, reverse;
    if(number > 999)
    {
        printf("Invalid the number is greater then 3 digit");
    }
   else
   {
    // r= reminder q = quotient
    int r1 = number % 10;
    int q1 = number / 10;

    int r2 = q1 % 10;
    int q2 = q1 / 10;

    int r3 = q2 % 10;
    int q3 = q2 / 10;

    sum = r1+ r2 + r3;
    printf("sum of the digit is %d", sum);

    // reverse 
    reverse = r1*100+r2*10+r3;
    printf(" reverse of the digit is %d", reverse);
   }
    
}