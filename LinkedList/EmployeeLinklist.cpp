#include "EmployeLinklist.h"

LinkedList::LinkedList()
{
    start = NULL;
}

bool LinkedList::insertAtBeg(Employee * d)
{
    Node *temp = new Node(data);

    temp->setNext(start);

    start = temp;

    return true;
}

void LinkedList::display()
{
    Node *temp = start;

    while (temp != NULL)
    {
        cout << temp->getData() << "-->";
        temp = temp->getNext();
    }
    // cout<<temp->getData();
}