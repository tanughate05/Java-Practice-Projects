#include<stdio.h>
#include<string.h>
#include<conio.h>
int countVowels(char *);
void main()
{
    char str[20]={"airm"};
   
    int res = countVowels(str);
    printf("%d",res);
}
int countVowels(char * str1)
{
    int count =0;
    for(int i =0;str1[i] != '\0';i++)
    {
        if(str1[i]=='a'|| str1[i]=='e'|| str1[i]=='i'||str1[i]=='o' ||str1[i]=='u')
        {
            count++;
        }
    }
    return count;
}