#include <iostream>
using namespace std;

int main()
{
    int arr[2][2];

    cout << "Enter the array elements in 2d array";
    // enter the 2d array elements
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cin >> arr[i][j];
        }
    }

    // print the 2d array elemnt
    cout << "print the array element";
    for (int i = 0; i < 2; i++)
    {
        cout << "\n";
        for (int j = 0; j < 2; j++)
        {
            cout << "\t" << arr[i][j];
        }
    }
    cout << "\n"
         << "-------------------";
    // print the diagonal in 2d array

    cout << "\n\n\n";
    for (int i = 0; i < 2; i++)
    {

        for (int j = 0; j <= i; j++)
        {
            cout << " ";
        }
        for (int j = 0 + i; j < 2; j++)
        {

            cout << arr[i][j];
        }
        cout << endl;
    }
}