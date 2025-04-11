#include "node.h"

Node::Node(int _data)
{
    data = _data;
    next = NULL;
    prev = NULL;
}

///////////////////////////////
void Node::setData(int _data)
{
    data = _data;
}

void Node::setNext(Node *_next)
{
    next = _next;
}

int Node::getData()
{
    return data;
}

Node *Node::getNext()
{
    return next;
}
////////////////////////////
void Node:: setPrev(Node * p)
{
    prev=p;
}
Node * Node::getPrev()
{
    return prev;
}