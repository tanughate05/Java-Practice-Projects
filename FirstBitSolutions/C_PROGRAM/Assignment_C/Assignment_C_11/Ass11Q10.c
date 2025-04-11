#include<stdio.h>
void main()
{
char str[10], rev_str[10];

printf("Enter a string: ");
gets(str);

strcpy(rev_str, str);
strrev(rev_str);

if (strcmp(str, rev_str) == 0)
    printf("%s is a palindrome string.\n", str);
else
    printf("%s is not a palindrome string.\n", str);
}