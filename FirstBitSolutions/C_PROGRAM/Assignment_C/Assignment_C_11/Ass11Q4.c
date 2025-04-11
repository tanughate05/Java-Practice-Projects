#include<stdio.h>
#include<string.h>
char *replaceLF(char *);
void main()
{
    char str[20]={"never"};
    char str2[20];
  printf("%s", replaceLF(str));
}
char * replaceLF(char * str)
{
    int len = strlen(str);
    char temp;
    for(int i=0;str[i]!='\0';i++)
    {
        temp = str[0];
        str[0]= str[len-1];
        str[len-1]= temp;
    }
    return str;
}