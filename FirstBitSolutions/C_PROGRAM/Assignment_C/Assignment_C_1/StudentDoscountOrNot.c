#include<stdio.h>
void main()
{
    // check if the person is student or not
    // student we type 'y'
    char choice = 'y';
    double DiscountPrice ;
    double  Price = 600;
    if(choice =='y')
    {
        if(Price  > 500)
        {
           DiscountPrice = Price* 0.2;
        }
        else
        {
              DiscountPrice = Price * 0.1;
        }
    }
    else
    {
        if (choice == 'N')
        {
          if(Price > 600)
          {
            DiscountPrice = Price * 0.15;
          }
          else
          {
            DiscountPrice = 0;
           }
        }
        else
        {
            printf("Invalid");
        }

    }
    printf("Discount price is %lf",DiscountPrice);

}