using namespace std;

class Book
{
  int  bid;
  char bname[20];
  int price;
  char author[20];

  static int count;
 public:
  //constructor
    Book();

  //Paramaterized Constructor
  Book(int,char * ,int,char *);
   
   //display
   void display();

   // static count function
   static void Showcount();
   
  //getters and setter

  int getbid();

  char* getbname();

  int getprice();

  char* getauthor();

  //set

  void setbid(int);

  void setbname(char *);

  void setprice(int);

  void setauthor(char *);
    
};