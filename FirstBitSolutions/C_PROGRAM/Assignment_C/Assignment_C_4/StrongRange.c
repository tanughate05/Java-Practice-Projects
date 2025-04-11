#include <stdio.h>
void main()
{
    int num = 400;
    int temp;
    int rem;
    int sum;

    // check
    for (int i = 1; i <= num; i++)
    {
        temp = i;
        sum = 0;
        while (temp > 0)
        {
            rem = temp % 10;
            int fact = 1;
            while (rem > 0)
            {

                fact = fact * rem;
                sum = sum + fact;
                rem--;
            }

            temp = temp / 10;
            if (sum == i)
            {
                printf(" Strong number %d", i);
            }
        }
    }
}