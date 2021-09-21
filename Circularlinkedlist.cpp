#include<iostream>
using namespace std;
class Clinked{
    private:
    int data;
    int count=0,count2=0 ,ct=0;
    Clinked *next,*start=NULL,*temp,*temp2,*temp3;
    public:
    void setData(int a)
    {
        Clinked *p=new Clinked();
        p->data=a;
        p->next=NULL;
        if(start==NULL)
        {
            start=p;
            p->next=start;

        }
        else{
            temp=start;
            while(temp->next!=start)
            {
                temp=temp->next;
            }
            temp->next=p;
            p->next=start;
        
        }

    }

    void deletebeg()
    {
        if(start==NULL)
        {
        count++;

        }
        else{
            temp=start;

            temp2=temp->next;
            if(temp->next==start)
            {
                start=NULL;
               
            }
            else{
            while(temp->next!=start)
            {
                temp=temp->next;
            }
            free(start);
            start=temp2;
            temp->next=start;
            }
           
        }
        if(count>=3)
        {
            cout<<"Your Empty Set But You Run Application More Then Three Please Insert Some Value Then Use Functionlaties\n";
           exit(0);
        }
    }
    void addbeg(int a)
    {
        Clinked *p=new Clinked();
        p->data=a;
        p->next=NULL;
        if(start==NULL)
        {
            start=p;
            p->next->start;
        }
        else{
            temp=start;
            p->next=temp;
            while(temp->next!=start)
            {
                temp=temp->next;
            }
            start=p;
            temp->next=start;

        }
        

    }
    void insertloc(int a,int l)
    {int b=a;
    Clinked *p=new Clinked();

        if(l==1)
        {
            addbeg(b);
        }
        else if(l<1)
        {
            cout<<"Wrong Location\n";
            exit(0);

        }
        else{
            p->data=a;
            p->next=NULL;
            if(start==NULL)
            {
                start=p;
                p->next=start;

            }
            else{
            temp=start;

            while(l>1)
            {
                if(temp->next!=start)
                {
                   
                    

                    temp2=temp;
                    temp=temp->next;

                }
                l--;
                

            }
            p->next=temp->next;
            temp2->next=p;
            }
            

        }
    }

    void deleteloc(int l)
    {
        if(start==NULL)
        {
            cout<<"Empty Set\n";
        }
        else{
            if(l==1)
            {
                deletebeg();
            }
            else if(l<0)
            {
                cout<<"Wrong Location\n";
                exit(0);
            }
            else{
                temp=start;
                
                while(l>1)
                {
                    if(temp->next!=start)
                    {
                        temp2=temp;
                        temp=temp->next;
                        count2=1;
                    }
                   

                    l--;
                }
                 if(count2==0)//if in our list reminder data only one but user enter loc one to more then if block executed
                 {
                int n;
                cout<<"Wrong Location\n";
                cout<<"Enter Other Location";
                cin>>n;
                if(n==1)
                {cout<<"Successfully... , Matched Your Location\n";
                }
                ct++;
               
                if(ct==4)
                {
                    cout<<"I Think You Want To Delete Data But You Enter Wrong Location, Then 'You Enter More Then 3 Times Your Data Automatically Detete By Admin\n";
                    deleteloc(1);
                }else{
                 deleteloc(n);//recursion
                 }
                }
                else{

                    
                temp2->next=temp->next;
                free(temp);
                free(temp3);
                count2=0;
                }

               
                
            }
        }
    }
    void getData()
    {
        if(start==NULL)
        {
            cout<<"Empty Set\n";
        }
        else{
            temp=start;
            while(temp->next!=start)
            {
                cout<<"\t"<<temp->data;
                temp=temp->next;
            }
             cout<<"\t"<<temp->data<<endl;
             
             temp=start;
             while(temp->next!=start)
            {
                cout<<temp<<" ";
                temp=temp->next;
            }
             cout<<temp<<" "<<temp->next<<endl;

        }
    }
    
};
int main()
{
    Clinked cl;
    cl.setData(1);
    cl.setData(2);
    cl.setData(3);
    cl.setData(4);
  
    
    cl.getData();
    cl.deletebeg();
    

    cl.getData();
    cl.addbeg(5);
    cl.getData();
    cl.insertloc(6,1);
    cl.getData();

    cl.deleteloc(1);
    cl.getData();
     cl.deleteloc(2);
    cl.getData();
    cl.deleteloc(2);
    cl.getData();
    cl.deleteloc(2);
    cl.getData();
    cl.deleteloc(2);
    cl.getData();
      
    
   
    return 0;

}