#include<iostream>
#include<conio.h>
using namespace std;
class TempratureConverter
{
    private:
    float c,f,k,r,re;

    public:
void celsius_to_Fahrenheit(float t)
{
f=(t*9.0)/5.0+32;
cout<<"\nCelsius_to_Fahrenheit:"<<t<<" C to "<<f<<" F"<<endl;
}
void fahrenheit_to_Celsius(float t)
{
c=(t-32.0)*(5.0/9.0);
cout<<"\nFahrenheit_to_Celsius:"<<t<<" F to "<<c<<" C"<<endl;
}
void kelvin_to_Fahrenheit(float t)
{
f=t*(9.0/5.0)-459.67;

cout<<"\nKelvin_to_Fahrenheit:"<<t<<" K to "<<f<<" F"<<endl;
}
void fahrenheit_to_Kelvin(float t)
{
k=(t+459.67)*(5.0/9.0);

cout<<"\nFahrenheit_to_Kelvin:"<<t<<" F to "<<k<<" K"<<endl;
}
void kelvin_to_Celsius(float t)
{
c=t-273.15;
cout<<"\nKelvin_to_Celsius:"<<t<<" K to "<<c<<" C"<<endl;
}
void celsius_to_Kelvin(float t)
{
k=t+273.15;
cout<<"\nCelsius_to_Kelvin:"<<t<<" C to "<<k<<" K"<<endl;

}
void rankine_to_Celsius(float t)
{
  c=(493.47*t-491.67)*(5.0/9.0);  
cout<<"\nRankine_to_Celsius:"<<t<<" R to "<<c<<" C"<<endl;

}
void celsius_to_Rankine(float t)
{
r=(t*(9.0/5.0)+491.67)/493.47;
cout<<"\nCelsius_to_Rankine:"<<t<<" C to "<<r<<" R"<<endl;
}
void rankine_to_Fahrenheit(float t)
{
f=-(t-459.67)/458.7;
cout<<"\nRankine_to_Fahrenheit:"<<t<<" R to "<<f<<" F"<<endl;
}
void fahrenheit_to_Rankine(float t)
{
r=-458.7*t+459.67;
cout<<"\nFahrenheit_to_Rankine:"<<t<<" F to "<<r<<" R"<<endl;
}
void rankine_to_kelvin(float t)
{
k=t*(5.0/9.0);
cout<<"\nRankine_to_kelvin:"<<t<<" R to "<<k<<" K"<<endl;
}
void kelvin_to_Rankine(float t)
{
r=t*(9.0/5.0);
cout<<"\nKelvin_to_Rankine:"<<t<<" K to "<<r<<" R"<<endl;
}
void reaumur_to_Celsius(float t)
{
c=t/0.80000;
cout<<"\nReaumur_to_Celsius:"<<t<<" Re to "<<c<<" C"<<endl;
}
void celsius_to_Reaumur(float t)
{
re=t*0.80000;
cout<<"\nCelsius_to_Reaumur:"<<t<<" C to "<<re<<" Re"<<endl;
}
void reaumur_to_Fahrenheit(float t)
{
f=t*2.2500+32.00;
cout<<"\nReaumur_to_Fahrenheit:"<<t<<" Re to "<<f<<" F"<<endl;
}
void fahrenheit_to_Reaumur(float t)
{
re=(t-32.00)/2.2500;
cout<<"\nFahrenheit_to_Reaumur:"<<t<<" F to "<<re<<" Re"<<endl;
}
void reaumur_to_kelvin(float t)
{
k=t/0.80000+273.15;
cout<<"\nReaumur_to_kelvin:"<<t<<" Re to "<<k<<" K"<<endl;
}
void kelvin_to_Reaumur(float t)
{
re=(t-273.15)*0.80000;
cout<<"\nKelvin_to_Reaumur:"<<t<<" K to "<<re<<" Re"<<endl;
}
void rankine_to_Reaumur(float t)
{
re=(t-491.67)*(4.0/9.0);
cout<<"\nRankine_to_Reaumur:"<<t<<" R to "<<re<<" Re"<<endl;
}
void reaumur_to_Rankine(float t)
{
r=(t*(9.0/4.0))+491.67;
cout<<"\nReaumur_to_Rankine:"<<t<<" Re to "<<r<<" R"<<endl;
}
void celsius_to_Celsius(float t)
{
c=t;
cout<<"\nCelsius_to_Celsius:"<<t<<" C to "<<c<<" C"<<endl;
}
void fahrenheit_to_Fahrenheit(float t)
{
f=t;
cout<<"\nFahrenheit_to_Fahrenheit:"<<t<<" F to "<<f<<" F"<<endl;
}
void kelvin_to_Kelvin(float t)
{
k=t;
cout<<"\nKelvin_to_Kelvin:"<<t<<" K to "<<k<<" K"<<endl;
}
void rankine_to_Rankine(float t)
{
r=t;
cout<<"\nRankine_to_Rankine:"<<t<<" R to "<<k<<" R"<<endl;
}
void reaumur_to_Reaumur(float t)
{
re=t;
cout<<"\nReaumur_to_Reaumur:"<<t<<" Re to "<<k<<" Re"<<endl;
}
};
int main()
{
int ch;
float n;

TempratureConverter tem;
do{
cout<<"\n\t\t\tChoose Temprature:--";
cout<<"\n1.celsius_to_Fahrenheit";
cout<<"\n2.Fahrenheit_to_Celsius";
cout<<"\n3.Celsius_to_Kelvin";
cout<<"\n4.Kelvin_to_Celsius";
cout<<"\n5.Fahrenheit_to_Kelvin";
cout<<"\n6.Kelvin_to_Fahrenheit";
cout<<"\n7.Fahrenheit_to_Rankine";
cout<<"\n8.Rankine_to_Fahrenheit";
cout<<"\n9.Fahrenheit_to_Reaumur";
cout<<"\n10.Reaumur_to_Fahrenheit";
cout<<"\n11.Renheit_to_Fahrenheit";
cout<<"\n12.Celsius_to_Rankine";
cout<<"\n13.Celsius_to_Reaumur";
cout<<"\n14.Celsius_to_Celsius";
cout<<"\n15.Rankine_to_Celsius";
cout<<"\n16.Reaumur_to_Celsius";
cout<<"\n17.Reaumur_to_Reaumur";
cout<<"\n18.Kelvin_to_Kelvin";
cout<<"\n19.Rankine_to_Rankine";
cout<<"\n20.Kelvin_to_Rankine";
cout<<"\n21.Kelvin_to_Reaumur";
cout<<"\n22.Rankine_to_Reaumur";
cout<<"\n23ankine_to_kelvin";
cout<<"\n24.Reaumur_to_kelvin";
cout<<"\n25.Reaumur_to_Rankine";
cout<<"\nFor Exit Press 26";
cout<<"\nEnter your Chooise:";
cin>>ch;


    switch (ch)
    {
    case 1:
   
    cout<<"\nEnter the value of celsius:";
    cin>>n;
    tem.celsius_to_Fahrenheit(n);
    
    break;
    case 2:
    cout<<"\nEnter the value of fahrenheit:";
    cin>>n;
    tem.fahrenheit_to_Celsius(n);
    break;
    case 3:
   
    cout<<"\nEnter the value of celsius:";
    cin>>n;
    tem.celsius_to_Kelvin(n);
    break;
    case 4:
   
    cout<<"\nEnter the value of kelvin:";
    cin>>n;
    tem.kelvin_to_Celsius(n);
    break;
    case 5:
   
    cout<<"\nEnter the value of fahrenheit:";
    cin>>n;
    tem.fahrenheit_to_Kelvin(n);
    break;
    case 6:
   
    cout<<"\nEnter the value of kelvin:";
    cin>>n;
    tem.kelvin_to_Fahrenheit(n);
    break;
    case 7:
   
    cout<<"\nEnter the value of fahrenheit:";
    cin>>n;
    tem.fahrenheit_to_Rankine(n);
    break;
    case 8:
   
    cout<<"\nEnter the value of rankine:";
    cin>>n;
    tem.rankine_to_Fahrenheit(n);
    break;
    case 9:
   
    cout<<"\nEnter the value of fahrenheit:";
    cin>>n;
    tem.fahrenheit_to_Reaumur(n);
    break;
    case 10:
   
    cout<<"\nEnter the value of reaumur:";
    cin>>n;
    tem.reaumur_to_Fahrenheit(n);
    break;
    case 11:
   
    cout<<"\nEnter the value of fahrenheit:";
    cin>>n;
    tem.fahrenheit_to_Fahrenheit(n);
    break;
    case 12:
   
    cout<<"\nEnter the value of celsius:";
    cin>>n;
    tem.celsius_to_Rankine(n);
    break;
    case 13:
   
    cout<<"\nEnter the value of celsius:";
    cin>>n;
    tem.celsius_to_Reaumur(n);
    break;
    case 14:
   
    cout<<"\nEnter the value of celsius:";
    cin>>n;
    tem.celsius_to_Celsius(n);
    break;
    case 15:
   
    cout<<"\nEnter the value of rankine:";
    cin>>n;
    tem.rankine_to_Celsius(n);
    break;
    case 16:
   
    cout<<"\nEnter the value of reaumur:";
    cin>>n;
    tem.reaumur_to_Celsius(n);
    break;
    case 17:
   
    cout<<"\nEnter the value of reaumur:";
    cin>>n;
    tem.reaumur_to_Reaumur(n);
    break;
    case 18:
   
    cout<<"\nEnter the value of kelvin:";
    cin>>n;
    tem.kelvin_to_Kelvin(n);
    break;
    case 19:
   
    cout<<"\nEnter the value of celsius:";
    cin>>n;
    tem.rankine_to_Rankine(n);
    break;
    case 20:
   
    cout<<"\nEnter the value of rankine:";
    cin>>n;
    tem.kelvin_to_Rankine(n);
    break;
    case 21:
   
    cout<<"\nEnter the value of kelvin:";
    cin>>n;
    tem.kelvin_to_Reaumur(n);
    
    break;
    case 22:
   
    cout<<"\nEnter the value of rankine:";
    cin>>n;
    tem.rankine_to_Reaumur(n);
    break;
    case 23:
   
    cout<<"\nEnter the value of rankine:";
    cin>>n;
    tem.rankine_to_kelvin(n);
    break;
    case 24:
   
    cout<<"\nEnter the value of reaumur:";
    cin>>n;
    tem.reaumur_to_kelvin(n);
    break;
    case 25:
   
    cout<<"\nEnter the value of reaumur:";
    cin>>n;
    tem.reaumur_to_Rankine(n);
    break;
   }
}while(ch!=26);
    return 0;

}                                                                                                                                                                                         