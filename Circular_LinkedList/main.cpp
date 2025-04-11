#include <iostream>
#include "linklist.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{

    LinkedList lt;
     //choice
     int choice =0;
     while(choice!= 4)
     {
          cout<<"\n\t\t1.Insert at position";
          cout<<"\n\t\t2.Display";
          cout<<"\n\t\t3.Delete from position";
          cout<<"\n\t\t4.Exit";
          cout<<"\n\t\t Enter your choice ";
          cin>>choice;
          switch (choice)
          {
             case 1:
                   {
                      int data, pos;
                      cout<<"\n Enter data and position";
                      cin>>data>>pos;
                      lt.insertAtPos(data,pos);
                   }
                   break;
            case 2:
                   {
                    lt.display();
                   }
                   break;
            case 3:
                   {
                    int pos;
                    cout<<"\n Enter the position for deletion";
                    cin>>pos;
                    lt.deletePos(pos);
                   }
                   break;
          
          default:
            break;
          }
     }
};