#include<iostream>
using namespace std;
#include<string.h>
int main()
{
    //patterns
    //* * * * *
    //*       *
    //*       *
    //*       *
    //* * * * *
   int rows =6;
   int cols=5;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {

            // If the index is at the border, then print *.
            if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                cout << "* ";
            else
                cout << "  ";
        }
        cout << endl;
    }
}