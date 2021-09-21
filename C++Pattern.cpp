#include<iostream>
using namespace std;
int main()
{

int i,j;
for(i=0;i<11;i++)
{
    for(j=0;j<24;j++)
    {
        if((i==0||i==10)&&(j>0&&j<5))
        {
            cout<<"S ";
        }
        else if((i>0&&i<5||i>5&&i<10)&&(j==0||j==12||j==20))
        {
            cout<<"S";
        }
        
        else if(i==5&&((j>7&&j<12)||(j>12&&j<16)||(j>16&&j<20)||(j>20&&j<24)))
        {
            cout<<"S";

        }
        else if(i==5&&j==0)
        cout<<"S";

        else
        cout<<" ";
       
        

    }
    cout<<"\n";
}
return 0;
}