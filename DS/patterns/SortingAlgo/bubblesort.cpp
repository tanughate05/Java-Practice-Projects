#include<iostream>
using namespace std;
int main()
{
    int size;
    cin>>size;
    int arr [size];
    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    Bubblesort(arr,size);
}
void Bubblesort(int arr[],int s)
{
    //sorting
    for(int i=s-1;i>=0;i--)
    {
        for(int j=0;j=i-1;j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j+1];
                arr[j+1]= arr[j];
                arr[j]= temp;
            }
        }
    }
    for(int i=0;i<s;i++)
    {
        cout<<"sorted array is";
      cout<<"\n"<<arr[i];
    }
}