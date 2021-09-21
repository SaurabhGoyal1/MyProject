			 /* Project Of Management */
/* Create Project By */
/* Name=Saurabh Goual */
/* Course=B.Tech (C.S) */
/* Date=08/09/2020 */
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>

struct bank{
char name[20], fname[20],mname[20],address[50];
char date;
double phone;
}b;
FILE *fp,*ft,*fa,*fal,*fb,*fr;
void insert();
void display();
void delet();
void delall();
void find();
void findsome();
void main()
{
clrscr();
printf("\t      ");
textcolor(RED);
cprintf("***************Management Of Bank Data***************");
int ch;
do{
textcolor(11);
printf("\n\t\t      ");
cprintf("----------Select Your Choise----------");

printf("\n");
cprintf("1.Insert Data Of Student.");
printf("\n");
cprintf("2.Information Of Student.");
printf("\n");
cprintf("3.Delete Of Data Perticular Student.");
printf("\n");
cprintf("4.Find Of Perticular Student.");
printf("\n");
cprintf("5.All Data Delete.");
printf("\n");
cprintf("6.Find Some Data .");

printf("\n");
cprintf("7.Close The Programe.");
printf("\n");
cprintf("Enter The Your Choise Number=");
scanf("%d",&ch);
switch(ch)
{
case 1:
insert();
break;
case 2:
display();
break ;
case 3:
delet();
break ;
case 4:
find();
break;
case 5:
delall();
break;
case 6:
findsome();
break;
case 7:
textcolor(12);
printf("\n");
cprintf("Thank You Your Programe Is Exit");
break;
default:
textcolor(RED);
printf("\n");
cprintf("Invalid Choise Please Try Again");
}
}
while(ch!=7);
getch();
}
void insert()
{
textcolor(11);
int k=0;
double num;
clrscr();
printf("\t\t");
cprintf("***************Insert The Data***************");
printf("\n");
fp=fopen("dat3.txt","ab");
fflush(stdin);
cprintf("Enter name=");
gets(b.name);
printf("\n");
cprintf("Enter father's name=");
gets(b.fname);
printf("\n");
cprintf("Enter mother's name=");
gets(b.mname);
printf("\n");
cprintf("Enter the Address=");
gets(b.address);
printf("\n");
cprintf("Enter number=");
scanf("%lf",&b.phone);
num=b.phone;
printf("\n");
/*fp=fopen("dat3.txt","rb");
if(fp==NULL)
{
cprintf("File is Empty");
}
else
{
while(fread(&b,sizeof(b),1,fp)==1)
{
if(num==b.phone)
k=1;
}
}
fclose(fp);
if(k==1)
{
cprintf("Invalid Phone Number");
}
else
{ */

fwrite(&b,sizeof(b),1,fp);
fclose(fp);
cprintf("Sucessfully");
}
void display()
{
int j;
clrscr();
textcolor(11);
printf("\t\t");
cprintf("*****************Bank Management**************");
printf("\n");
fp=fopen("dat3.txt","rb");
gotoxy(1,5);
cprintf("Name             Fname            Mname                Address        Phone no");
gotoxy(1,6);
cprintf("--------------------------------------------------------------------------------");

j=8;
while(fread(&b,sizeof(b),1,fp)==1)
{
gotoxy(1,j);
cprintf("%-15s||%-15s||%-19s||%-13s||%-10lf",b.name,b.fname,b.mname,b.address,b.phone);
cprintf("--------------------------------------------------------------------------------");
j++;

}
fclose(fp);
}
void delet()
{
textcolor(11);
int nu;
int f=0;
clrscr();
printf("\t\t");
cprintf("***************Delete Perticular Data***************");
printf("\n");
cprintf("Enter the phone no for delete data=");
scanf("%d",&nu);
fp=fopen("dat3.txt","rb");
ft=fopen("Temp.txt","ab");
while(fread(&b,sizeof(b),1,fp)==1)
{
if(nu==b.phone)
f=1;
else
fwrite(&b,sizeof(b),1,ft);

}
fclose(fp);
fclose(ft);
remove("dat3.txt");
rename("Temp.txt","dat3.txt");
if(f==0)
cprintf("Record Not Found....");
else
printf("Record Delete Successfully....");
}

void delall()
{

int nu;
int f=0;
clrscr();

textcolor(11);
printf("\t\t");
cprintf("***************Delete All Data***************");
printf("\n");
fp=fopen("dat3.txt","rb");
while(fread(&b,sizeof(b),1,fp)==1)
{ f=1;
}

fclose(fp);
remove("dat3.txt");
if(f==0)
cprintf("Record Not Found....");
else
cprintf("All Record Delete Successfully....");
}
void find()
{
int nu,j;
clrscr();
textcolor(11);
printf("\t\t");
cprintf("***************Find Perticular Data***************");

printf("\n");
cprintf("Enter the phone no for find the perticular acounter=");
scanf("%d",&nu);

fp=fopen("dat3.txt","rb");
fa=fopen("find.txt","ab");
while(fread(&b,sizeof(b),1,fp)==1)
{
if(nu==b.phone)
{
fwrite(&b,sizeof(b),1,fa);
}
}
fclose(fa);
fclose(fp);

fa=fopen("find.txt","rb");

cprintf("Name             Fname            Mname                Address        Phone no");
printf("\n");
cprintf("--------------------------------------------------------------------------------");
printf("\n");
while(fread(&b,sizeof(b),1,fa)==1)
{

cprintf("%-15s||%-15s||%-19s||%-13s||%-10lf",b.name,b.fname,b.mname,b.address,b.phone);
cprintf("--------------------------------------------------------------------------------");
}
fclose(fa);
remove("find.txt");
}
void findsome()
{
int nu[20],j,i;
clrscr();
textcolor(11);
printf("\t\t");
cprintf("***************Find Some Data***************");
printf("\n");
cprintf("Enter the range of data find=");
printf("\n");
fp=fopen("dat3.txt","rb");
fal=fopen("find1.txt","ab");
scanf("%d",&j);
for(i=1;i<=j;i++)
{
cprintf("Enter the phone no for find the acounter=");
scanf("%d",&nu[i]);
}

for(i=1;i<=j;i++)
{
while(fread(&b,sizeof(b),1,fp)==1)
{
if(nu[i]==b.phone)
{
fwrite(&b,sizeof(b),1,fal);
}
}
}
fclose(fal);
fclose(fp);
fal=fopen("find1.txt","rb");
cprintf("Name             Fname            Mname                Address        Phone no");
printf("\n");
cprintf("--------------------------------------------------------------------------------");
printf("\n");
while(fread(&b,sizeof(b),1,fal)==1)
{
cprintf("%-15s||%-15s||%-19s||%-13s||%-10lf",b.name,b.fname,b.mname,b.address,b.phone);
cprintf("--------------------------------------------------------------------------------");
}
fclose(fal);
remove("find1.txt");
}