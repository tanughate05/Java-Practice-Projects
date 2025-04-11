#include <stdio.h>
void main()
{
    char str[20];
    gets(str);

    for (int i = 0; str[i] != 0; i++)
    {
        if (str[i] == 'a')
        {
            str[i] = '$';
        }
    }
    printf("%s", str);
}
