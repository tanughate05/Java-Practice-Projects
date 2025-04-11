#include "node.h"

template <typename T>
Node<T>::Node(T _data)
{
    data = _data;
    next = nullptr;
}

// Getters
template <typename T>
T Node<T>::getData()
{
    return data;
}

template <typename T>
Node<T> *Node<T>::getNext()
{
    return next;
}

// Setters
template <typename T>
void Node<T>::setData(T d)
{
    data = d;
}

template <typename T>
void Node<T>::setNext(Node<T> *nex)
{
    next = nex;
}
