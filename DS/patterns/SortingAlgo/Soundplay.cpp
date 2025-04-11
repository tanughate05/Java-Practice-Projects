#include<iostream>
#include<windows.h>
#include<mmsystem.h>

#pragma comment(lib,"winmm.lib")
int main()
{
    PlaySound(TEXT("zara zara.wav"),NULL,SND_FILENAME|SND_SYNC);
    system("pause");
    return 0;
}