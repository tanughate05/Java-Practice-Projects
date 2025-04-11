#include <stdio.h>
#include <string.h>

void Countwords(char *);
void main()
{
    char str[20] = {"airm hfgh dfhg"};
    Countwords(str);
}
void Countwords(char *str1)
{
    char ch = str1[0];
    int count = 0;
    int i = 0;
    while (ch != '\0')
    {
        ch = str1[i];
        if (isspace(ch))
        {
            count++;
        }
        i++;
    }

    printf("%d", count + 1);
}