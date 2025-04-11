#include "book.h"

int main()
{
    Book b1(1,"Sita",200,"Sudha Murthy");
    b1.display();
    Book::Showcount();
    Book b2(2,"Diary of wimpy kid",200,"Jeff kinny");
    b2.display();
    Book::Showcount();
    Book b3(3,"Twilight",300,"Stephenie Meyer");
    b3.display();
    Book::Showcount();

    return 0;
}