#include <stdio.h>
#include <string.h>
#include <conio.h>
char *countVowels(char *);
void main()
{
    char str[20] = {"air m"};

    char *res = countVowels(str);
    printf("%s", res);
}
char *countVowels(char *str1)
{
   
    for (int i = 0; str1[i] != '\0'; i++)
    {
        if (isblank(str1[i]))
        {
            str1[i] = '#';
        }
    }
    return str1;
}