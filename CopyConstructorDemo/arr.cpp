#include "arr.h"
#include <iostream>
using namespace std;

MyArray::MyArray(int s)
{
    index = -1;
    size = s;
    pArr = new int[size];
}

bool MyArray::isEmpty()
{
    if (index == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool MyArray::isFull()
{
    if (index == size - 1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool MyArray::addElement(int ele)
{
    if (isFull())
    {
        cout << "Array is full" << endl;
        return false;
    }
    else
    {
        pArr[++index] = ele;
        return true;
    }
}

int MyArray::searchElement(int ele)
{
    if (isEmpty())
    {
        cout << "Array is empty" << endl;
        return -1;
    }
    else
    {
        for (int i = 0; i <= index; i++)
        {
            if (pArr[i] == ele)
            {
                return i;
            }
        }
        return -1;
    }
}

bool MyArray::removeElement(int ele)
{
    if (isEmpty())
    {
        cout << "Array is empty" << endl;
        return false;
    }
    else
    {
        int found = searchElement(ele);
        if (found == -1)
        {
            cout << "Element not found" << endl;
            return false;
        }
        else
        {
            for (int i = found; i < index; i++)
            {
                pArr[i] = pArr[i + 1];
            }
            index--;
            return true;
        }
    }
}

void MyArray::display()
{
    if (isEmpty())
    {
        cout << "Empty array" << endl;
    }
    else
    {
        for (int i = 0; i <= index; i++)
        {
            cout << pArr[i] << " ";
        }
        cout << endl;
    }
}