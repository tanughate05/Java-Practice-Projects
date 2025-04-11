#include<iostream>
using namespace std;

//insertion sort

int main()
{
    //take a array
    int size=5;
  
    int arr[size]={30,72,5,61,10};
   
    //sort
    int current =0;
    
    for(int i=1;i<size;i++)
    {
        current = arr[i];
        int j =0;
        j=i-1;
        while (j >=0 && current< arr[j])
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] =current;
    }//print the sorted array
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
}