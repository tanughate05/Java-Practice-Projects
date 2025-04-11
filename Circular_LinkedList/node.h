#include<iostream>
using namespace std;

//////////////////////////
class  Node
{
    int data;
    Node * next,* prev;

public:

    Node(int );
    void setData(int );
    void setNext(Node *);
    void setPrev(Node *);

    int getData();                                                                                                         
    Node *getNext();
    Node * getPrev();
};


