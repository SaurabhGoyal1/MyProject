#include<iostream>
#include<conio.h>
using namespace std;
class PopulationTwoVillage
{
private:
int first_village_population,second_village_population;
int first_village_population_increasing,second_village_population_decreasing;
float year;
int k=0;
public:
void villagePopulation(int _firstVillage,int _secondVillage,int _firstVillageIncreasing,int _secondVillageDecreasing)
{
    first_village_population=_firstVillage;
    second_village_population=_secondVillage;
    first_village_population_increasing=_firstVillageIncreasing;
    second_village_population_decreasing=_secondVillageDecreasing;

    year=(second_village_population-first_village_population)/(first_village_population_increasing+second_village_population_decreasing);


} 
void villagePoplutionDisp()
{
    cout<<"\nFirst Village Population Value:"<<first_village_population;
    cout<<"\nFirst Village Population Increasing Value:"<<first_village_population_increasing;
    cout<<"\nSecond Village Population Value:"<<second_village_population;
    cout<<"\nSecond Village Population Decreasing Value:"<<second_village_population_decreasing;
    cout<<"\nThese Two Village Are Equal Of The Year:"<<year<<endl;

}
};
void main()
{
 int first_village_population,second_village_population;
 int first_village_population_increasing,second_village_population_decreasing;
 cout<<"\nWhen Two Village Are Equal In Population Calculate The Yera...\n";
 cout<<"\nEnter The First Village Population Value:";
 cin>>first_village_population;
 cout<<"\nEnter The First Village Population Increasing Value:";
 cin>>first_village_population_increasing;
 cout<<"\nEnter The Second Village Population Value:";
 cin>>second_village_population;
 cout<<"\nEnter The Second Village Population Decreasing Value:";
 cin>>second_village_population_decreasing;
 
 PopulationTwoVillage calcu;
 if((first_village_population<second_village_population&&first_village_population_increasing>=0&&second_village_population_decreasing>=0&&first_village_population>=0&&second_village_population>=0))
{
 calcu.villagePopulation(first_village_population,second_village_population,first_village_population_increasing,second_village_population_decreasing);
 calcu.villagePoplutionDisp();
}
else{
    cout<<"\nYou Enter The Incorrect Value..\n";
}
 getch();
}