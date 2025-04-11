#include<stdio.h>
void main()
{
    int no =10;
    int flag ;
    int i;

    for( i = 2;i <= no;i++)
    {
         int j = 2;
         flag = 0;
         while (j < i)
         {
            if(i % j == 0)
            {
                flag = 1;
                break;
            }
            j++;
         }
         
         if (flag == 0)
         {
           printf("the prime is %d", i);
         }
    }
  
}