#include <stdio.h>
void removeNth(char *);
    void main()
    {
        char str[20];

        gets(str);

        removeNth(str);
    }
 void removeNth(char *st)
{
        int check = 0;
        for (int i = 0; st[i] != '\0'; i++)
        {
            if (st[i] == 'o')
            {
                check = 1;
            }
            st[i] = st[i + check];
        }
        printf("%s", st);
}
