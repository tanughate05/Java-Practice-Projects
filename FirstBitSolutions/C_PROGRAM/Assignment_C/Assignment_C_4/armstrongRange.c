
#include <stdio.h>

void main()
{
    int num = 10;
    int count = 0;
    int sum = 0;
    int rem, powersum = 0;
    int totalsum ;
    for (int i = 1; i < 10; i++)
    {
        
        while (num  != 0)
        {
           
            i = i / 10;
        }
        int t = count;
        for(int j = i;j > 0;j--)
        {
            rem = j % 10;

            // find the power to the number
            while (t > 0)
            {
                sum = t * rem;
                t--;
            }
            powersum = powersum + sum;
            j = j / 10;
        }
       
    }
   printf("%d",powersum);
}