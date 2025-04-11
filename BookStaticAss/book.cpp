#include"book.h"
#include<string.h>
#include<iostream>
using namespace std;

int Book :: count =0;
 //constructor
 Book::Book()
 {
    bid =0;
    strcpy(bname,"not given");
    price =0;
    strcpy(author,"not given");
    count++;
    
 }

 //paramterised constructor
 Book::Book(int i,char* n,int p,char * a)
 {
    bid = i;
    strcpy(bname,n);
    price =p;
    strcpy(author,a);
    count++;
 }

  //getters
 int Book::getbid()
 {
    return this->bid;
 }

 char* Book::getbname()
 {
    return this->bname;
 }
 int Book::getprice()
 {
    return this->price;
 }
 char * Book ::getauthor()
 {
    return this->author;
 }

//setters
void Book::setbid(int i)
{
    this->bid = i;
}

void Book::setbname(char* n)
{
    strcpy(bname,n);
}

void Book::setprice(int p)
{
    this->price= p;
}
void Book::setauthor(char * a)
{
    strcpy(author,a);
}

//display 
void Book::display()
{
    cout<<"The id of Book is: "<<bid<<endl;
    cout<<"Book name is: "<<bname<<endl;
    cout<<"Book price is:"<<price<<endl;
    cout<<"Book author is: "<<author<<endl;
}

//static function
void Book::Showcount()
{
    cout<<"The count of object created is"<<count<<endl;
}