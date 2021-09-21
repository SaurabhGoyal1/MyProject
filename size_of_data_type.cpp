#include<iostream>
using namespace std;
class SizeOfDataType{
    public:
    void size(string x)
    {
        if(x=="int")
        cout<<"\nSize Of Int=${"<<sizeof(int)<<"}"<<endl;
        else if(x=="float")
        cout<<"\nSize Of Float=${"<<sizeof(float)<<"}"<<endl;
        else if(x=="double")
        cout<<"\nSize Of Double=${"<<sizeof(double)<<"}"<<endl;
        else if(x=="long")
        cout<<"\nSize Of Long=${"<<sizeof(long)<<"}"<<endl;
        else if(x=="char")
        cout<<"\nSize Of Char=${"<<sizeof(char)<<"}"<<endl;
        else if(x=="bool")
        cout<<"\nSize Of Bool=${"<<sizeof(bool)<<"}"<<endl;
        else if(x=="short")
        cout<<"\nSize Of Short=${"<<sizeof(short)<<"}"<<endl;
        else if(x=="long long")
        cout<<"\nSize Of Long Long=${"<<sizeof(long long)<<"}"<<endl;
        else if(x=="long double")
        cout<<"\nSize Of Long Double=${"<<sizeof(long double)<<"}"<<endl;
        else
        cout<<"You Enter Incorrect DataType\n";

    }
};
int main()
{
    SizeOfDataType s;
    s.size("int");
    
    return 0;
}