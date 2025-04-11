
#include "linklist.h"

LinkedList::LinkedList()
{
    start = NULL;
     
}



void LinkedList::insertAtPos(int data,int pos)
{
    Node * temp = new Node(data);
    if(start == NULL)
    {
        start = temp;
        return;
    }
    if(pos == 1)
    {
        temp->setNext(start);
        start->setPrev(temp);
        start = temp;
        return;
    }
    Node * p =start;
    int i=1;
    while(p->getNext()!= NULL && i<pos-1)
    {
        i++;
        p=p->getNext();
    }
    temp->setNext(p->getNext());
    temp->setPrev(p);
    p->setNext(temp);
    if(temp->getNext()!=NULL)
    {
    temp->getNext()->setPrev(temp);
    }
}

void LinkedList::display()
{
    if(start ==NULL)
    {
        cout<<"\n NODES TO DISPLAY";
        return;
    }
    else
    {
        Node * p =start;
        while(p!= NULL)
        {
            cout<<"\t"<<p->getData();
            p=p->getNext();
        }
    }
}
/////////////////////////////////
void LinkedList::deletePos(int pos)
{
         if(start == NULL)
         {
            cout<<"\n No node to delete";
            return;
         }
         ///////////////////////////////////
         // delete node data for position
         else
         {
            Node * p = start;

             if(pos == 1)
             {
                 start = start->getNext();
                 cout<<"\n the data is deleted";

                 //check if start is null or not and set it to null
                 if(start != NULL)
                 {
                    start->setPrev(NULL); 
                 }
                 delete p;
                 return;
             }
            
         }
                                                        
}