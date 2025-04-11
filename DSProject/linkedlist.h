#include "Node.h"
#include <fstream>
#include <iostream>
using namespace std;

// Template LinkedList class
template <typename T>
class LinkedList
{
    Node<T> *start;

public:
    LinkedList();
    void insertAtPos( T , int);
    void deleteAtPos(int);
    void display() ;
    void readFromFile( string );
    void writeToFile( string );
    ~LinkedList();
};

