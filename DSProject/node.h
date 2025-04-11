#include <iostream>
using namespace std;

// Template class Node
template <typename T>
class Node
{
    T data;
    Node<T> *next;

public:
    // Constructor
    Node(T value);

    // Getters
    T getData();
    Node<T> *getNext();

    // Setters
    void setData(T value);
    void setNext(Node<T> *node);
};
