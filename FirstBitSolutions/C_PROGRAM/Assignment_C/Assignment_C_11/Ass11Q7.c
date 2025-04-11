#include <stdio.h>
#include <string.h>
#include <conio.h>
void OddRemove(char *);
void main()
{
    char str[20] = {"airm"};
    OddRemove(str);
}
void OddRemove(char *str1)
{
    int check = 0;
    for (int i = 0; str1[i] != '\0'; i++)
    {
        if (str1[i] % 2 == 1)
        {
            check = 1;
        }
        str1[i] = str1[i + check];
    }
    printf("%s", str1);
}