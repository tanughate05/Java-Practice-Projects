#include"arr.h"

int main()
{
    MyArray a1(5);
    int choice =0;
    while(choice != 5)
    {
        cout<<"\n\t\t1.Add element";
        cout<<"\n\t\t2.Display elements";
        cout<<"\n\t\t3.Delete element";
        cout<<"\n\t\t4.Search element";
        cout<<"\n\t\t5.Exit";
        cout<<"\nEnter your choice :";
        cin>>choice;
        switch(choice)
        {
             case 1:
                   {
                    int ele;
                    cout<<"\nEnter element :";
                    cin>>ele;
                    if(a1.addElement(ele))
                    {
                         cout<<"\nSucess";
                    }
                    else
                    {
                        cout<<"\nFailed";
                    }
                   }
             case 2 :
                      a1.display();
                      break;
            case 3 :
                    {
                        int ele;
                        cout<<"\nEnter element :";
                        cin>>ele;
                        if(a1.removeElement(ele))
                        {
                            cout<<"\nSuccess";
                        }
                        else{
                            cout<<"\nFailed";
                        }
                    }
        }
    }
}