#include<iostream>
using namespace std;
class LinkedList{
private:
    int info;
    LinkedList *next,*start=NULL,*temp,*temp2,*temp3;
public:
void setdata(int a)
{
    LinkedList *ptr=new LinkedList();
    ptr->info=a;
    ptr->next=NULL;
    if(start==NULL)
    {
        start=ptr;
    }
    else{
        temp=start;
        while(temp->next!=NULL)
        {
            temp=temp->next;

        }
        temp->next=ptr;
    }

}
void begningadd(int a)
{   LinkedList *bptr=new LinkedList();
    bptr->info=a;
    bptr->next=NULL;

    if(start==NULL)
    {
        start=bptr;
    }
    else{
        temp=start;
        start=bptr;
        start->next=temp;

    }
}
void deletelast()
{
    if(start==NULL)
    {
        cout<<"\nLinked List is empty";
    }
    else{
        temp=start;
        while(temp->next!=NULL)
        {   temp2=temp;
            temp=temp->next;
            
        }
        free(temp);
        temp2->next=NULL;

    }
}
void deletebeg()
{
    if(start==NULL)
    {
        cout<<"\nLinked List is empty";
    }
    else{
        temp=start;
        start=temp->next;
        free(temp);

    }
}
void insertloc(int l,int n)
{
    LinkedList *ptrl=new LinkedList();
    if(l==1)
    {
        begningadd(n);
    }
    else{
        temp=start;
        
        while(l>1)
        {
            temp2=temp;
            temp=temp->next;

            l=l-1;
        }
        
        
        ptrl->info=n;
      
        temp2->next=ptrl;
        ptrl->next=temp;
    }
}
void deleteloc(int l)
{
    if(l==1)
    {
        deletebeg();
    }
    else{
        temp=start;
        while(l>1)
        {
            temp2=temp;
            temp=temp->next;
            l=l-1;
        }
        temp2->next=temp->next;
        free(temp);
    }
}
void deleteall()
{
    if(start==NULL)
    {
        cout<<"Linked List is empty\n";

    }
    else{
        temp=start;
        while(temp!=NULL)
        {
            temp2=temp;
            temp=temp->next;
            free(temp2);
            
        }
        free(temp);
        start=NULL;
        cout<<"Delete All Element\n";
    }
}
void search(int n)
{
    if(start==NULL)
    {
        cout<<"Linked List is empty\n";

    }
    else{
        temp=start;
        int k=0;
        while(temp!=NULL)
        {
            if(temp->info==n)
            {
               k=1;
               break;
            }
            else
               temp=temp->next;
        }
        if(k==1)
        {
            cout<<"Yes number is found\n";
        }
        else{
            cout<<"No number is not found\n";
        }
    }

}
void count()
{
    int countNo=0;
    if(start==NULL)
    {
        cout<<"Linked List is empty\n";

    }
    else{
        temp=start;
    while(temp!=NULL)
    {
        countNo=countNo+1;
        temp=temp->next;
    }
    cout<<"Length of Linked List:"<<countNo<<endl;
}}
void findNoWL(int l)
{
    if(start==NULL)
    {
        cout<<"Linked List is empty\n";

    }
    else{
        temp=start;
    while(l>1)
    {
        temp=temp->next;
        l=l-1;
    
    }
    cout<<"Find Number:"<<temp->info<<endl;

}}
void findLoWN(int n)
{
    if(start==NULL)
    {
        cout<<"Linked List is empty\n";

    }
    else{
        int c=0;
        temp=start;
        while(temp!=NULL)
        {
            if(temp->info==n)
            {
                break;
            }
            else{
                c=c+1;
                temp=temp->next;

            }
        }
        cout<<"This number at "<<c+1<<" location"<<endl;
}}
void sortlistIn()
{
    int t;
    temp=start;
    while(temp->next!=NULL)
    {
        temp2=temp->next;
        while(temp2!=NULL)
        {
            if(temp->info>temp2->info)
            {
                t=temp->info;
                temp->info=temp2->info;
                temp2->info=t;

            }
            temp2=temp2->next;

        }
        temp=temp->next;
    }


}
void sortlistDe()
{
    int t;
    temp=start;
    while(temp->next!=NULL)
    {
        temp2=temp->next;
        while(temp2!=NULL)
        {
            if(temp->info<temp2->info)
            {
                t=temp->info;
                temp->info=temp2->info;
                temp2->info=t;

            }
            temp2=temp2->next;

        }
        temp=temp->next;
    }


}
void reversList()
{
    
    temp=start;
    temp3=NULL;
    while(temp!=NULL)
    {
       
        temp2=temp->next;
        temp->next=temp3;
        temp3=temp;

        temp=temp2;
    }
        
    
}
void disp()
{
    if(start==NULL)
    {
        cout<<"\nLinked List Is Empty:"<<endl;
    }
    else{
        temp=start;
        while(temp!=NULL)
        {
            cout<<temp->info<<"->";
            temp=temp->next;
        }
        cout<<"NULL"<<endl;

    }
}

};
int main()
{
    LinkedList list1;
    int ch;
    do{
        cout<<"\n\t\tLinked List\n";
        cout<<"1.Insert In Last:\n";
        cout<<"2.Insert In Begning\n";
        cout<<"3.Delete At Last\n";
        cout<<"4.Delete At Begning\n";
        cout<<"5.Insert Number At Location\n";
        cout<<"6.Delete Number At Location\n";
        cout<<"7.Delete All Element\n";
        cout<<"8.Search Number\n";
        cout<<"9.Lenght Of Linked List\n";
        cout<<"10.Find Number With Location\n";
        cout<<"11.Sort List Incresing Order\n";
        cout<<"12.Sort List Decresing Order\n";
        cout<<"13.Find Location With Number\n";
        cout<<"14.Revers List\n";
        cout<<"15.Show Data:\n";
        
        cout<<"16.Exit\n";
        cout<<"Enter your choise:";
        cin>>ch;
        switch(ch)
        {
        case 1:
        {
            int n;
            cout<<"\nEnter the data:";
            cin>>n;
            list1.setdata(n);
            break;
        }
        case 2:
        {
            int n;
            cout<<"\nEnter the data:";
            cin>>n;
            list1.begningadd(n);
            break;
        }
        case 3:
        {
            list1.deletelast();
            break;
        }
        case 4:
        {
            list1.deletebeg();
            break;
        }
        case 5:
        {
            int l;
            cout<<"\nEnter the location:";
            cin>>l;
            int n;
            cout<<"\nEnter the data:";
            cin>>n;
            list1.insertloc(l,n);
            break;
        }
        case 6:
        {
            int l;
            cout<<"\nEnter the location:";
            cin>>l;
            list1.deleteloc(l);
            break;
        }
        case 7:
        {
            list1.deleteall();
            break;
        }
        case 8:
        {
            int n;
            cout<<"\nEnter the data for searching:";
            cin>>n;
            list1.search(n);
            break;
        }
        case 9:
        {
            list1.count();
            break;
        }
        case 10:
        {
            int l;
            cout<<"\nEnter the location for find element:";
            cin>>l;
            list1.findNoWL(l);
            break;
        }
        case 11:
        {
            list1.sortlistIn();
            break;
        }
        case 12:
        {
            list1.sortlistDe();
            break;
        }
        case 13:
        {
            int n;
            cout<<"\nEnter the data for find location:";
            cin>>n;
            list1.findLoWN(n);
            break;
        }
        case 14:
        {
            list1.reversList();
            break;
        }
        case 15:
        {
            list1.disp();
            break;
        }

        }
    }while(ch!=16);
    return 0;
}
