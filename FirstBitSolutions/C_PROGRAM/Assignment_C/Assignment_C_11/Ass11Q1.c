#include <stdio.h>
void main()
{
    char str[20];
    gets(str);
    char ch;
    scanf("%c", &ch);
    for (int i = 0; str[i] != 0; i++)
    {
        if (str[i] == ch)
        {
            printf(" found ");
        }
    }
}