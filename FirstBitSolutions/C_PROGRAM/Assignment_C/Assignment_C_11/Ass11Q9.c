#include<stdio.h>
int length(char *);
void main()
{
    char ch1[10] = {"rock"};
    char ch2[5] ={"tap"};
    int len1 = length(ch1);
    int len2 = length(ch2);

    if(len1 > len2)
    {
        printf("%s",ch1);
    }
    else
    {
        printf("%s",ch2);
    }
}
int length(char *str1)
{
    int count = 0;
    int i = 0;
    while (str1[i] != '\0')
    {
        count++;
        i++;
    }
    return count;
}