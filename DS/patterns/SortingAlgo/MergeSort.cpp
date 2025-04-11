#include <iostream>
using namespace std;

void mergeSort(int arr[], int l, int r);
void merge(int arr[], int l, int mid, int r);

void mergeSort(int arr[], int l, int r)
{
    if (l < r)
    {
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
}

void merge(int arr[], int l, int mid, int r)
{
    int temp[r - l + 1];
    int i = l;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= r)
    {
        if (arr[i] <= arr[j])
        {
            temp[k++] = arr[i++];
        }
        else
        {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid)
    {
        temp[k++] = arr[i++];
    }

    while (j <= r)
    {
        temp[k++] = arr[j++];
    }

    for (int s = 0; s < k; s++)
    {
        arr[l + s] = temp[s];
    }
}

int main()
{
    int arr1[5];
    for (int i = 0; i < 5; i++)
    {
        cin >> arr1[i];
    }

    cout << "Before Merge Sort: " << endl;
    for (int i = 0; i < 5; i++)
    {
        cout << arr1[i] << " ";
    }
    cout << endl;

    mergeSort(arr1, 0, 4);

    cout << "After Merge Sort: " << endl;
    for (int i = 0; i < 5; i++)
    {
        cout << arr1[i] << " ";
    }
    cout << endl;
}