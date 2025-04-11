#include<iostream>
using namespace std;

////////////////////////////
class MyArray  
{
    int index,size;
    int *pArr;
    public:
        MyArray(int);
        bool isEmpty();
        bool isFull();
        bool addElement(int);
        int searchElement(int);
        bool removeElement(int);
        void display();
};
