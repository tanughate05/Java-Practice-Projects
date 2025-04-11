#include"Employe.h"

class LinkedList
{

    struct Employee *start;

public:
    LinkedList();
    bool insertAtBeg(Employee * d);
    void display();
};
