#include<iostream>
using namespace std;
int main()
{
    // int a[4][4],i,j;
    // cout<<"\n\t\t\t2D Array Program :"<<endl<<endl;
    // for(i=0;i<3;i++)
    // {
    //     for(j=0;j<3;j++)
    //     {
    //         cout<<"Enter the value a["<<i+1<<"]["<<j+1<<"]:";
    //         cin>>a[i][j];
    //     }
    // }
    // cout<<"\nThis is 2D array"<<endl;
    // for(i=0;i<3;i++)
    // {
    //     for(j=0;j<3;j++)
    //     {
    //         cout<<a[i][j]<<" ";
            
    //     }
    //     cout<<endl;
    // }


//###################Sum of diagonal 2d array when same index############


// int a[4][4],i,j;
//     cout<<"\n\t\t\t2D Array Program :"<<endl<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<"Enter the value a["<<i+1<<"]["<<j+1<<"]:";
//             cin>>a[i][j];
//         }
//     }
//     cout<<"\nThis is 2D array"<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<a[i][j]<<" ";
            
//         }
//         cout<<endl;
//     }
//     int sum=0;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             if(i==j)
//             {
//                 sum=sum+a[i][j];
                
//             }
            
//         }
        
//     }
//     cout<<"\nSum of diagonal 2D array:"<<sum<<endl;




//############Sum of diagonal 2d array when different index#################




//  int a[4][4],i,j;
//     cout<<"\n\t\t\t2D Array Program :"<<endl<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<"Enter the value a["<<i+1<<"]["<<j+1<<"]:";
//             cin>>a[i][j];
//         }
//     }
//     cout<<"\nThis is 2D array"<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<a[i][j]<<" ";
            
//         }
//         cout<<endl;
//     }
//     int sum=0;
//     int k=0,l=3;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             if(i==k&&j==l)
//             {
//                 sum=sum+a[i][j];
//                 k=k+1;
//                 l=l-1;
//             }
            
//         }
        
//     }
//     cout<<"\nSum of diagonal 2D array:"<<sum<<endl;


//###################Sum of above and below the diagonal 2d array ############


// int a[4][4],i,j;
//     cout<<"\n\t\t\t2D Array Program :"<<endl<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<"Enter the value a["<<i+1<<"]["<<j+1<<"]:";
//             cin>>a[i][j];
//         }
//     }
//     cout<<"\nThis is 2D array"<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<a[i][j]<<" ";
            
//         }
//         cout<<endl;
//     }
//     int sum=0;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             if(i!=j)
//             {
//                 sum=sum+a[i][j];
                
//             }
            
//         }
        
//     }
//     cout<<"\nSum of diagonal 2D array:"<<sum<<endl;




//############Sum above and below the diagonal 2d array when different index#################




//  int a[4][4],i,j;
//     cout<<"\n\t\t\t2D Array Program :"<<endl<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<"Enter the value a["<<i+1<<"]["<<j+1<<"]:";
//             cin>>a[i][j];
//         }
//     }
//     cout<<"\nThis is 2D array"<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<a[i][j]<<" ";
            
//         }
//         cout<<endl;
//     }
//     int sum=0;
//     int k=0,l=3;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             if(i==k&&j==l)
//             {
                
//                 k=k+1;
//                 l=l-1;
//             }
//             else{
//                 sum=sum+a[i][j];
//             }
            
//         }
        
//     }
//     cout<<"\nSum of diagonal 2D array:"<<sum<<endl;



//############Sum above and below the diagonal 2d array when same index and different index#################


// int a[4][4],i,j;
//     cout<<"\n\t\t\t2D Array Program :"<<endl<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<"Enter the value a["<<i+1<<"]["<<j+1<<"]:";
//             cin>>a[i][j];
//         }
//     }
//     cout<<"\nThis is 2D array"<<endl;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             cout<<a[i][j]<<" ";
            
//         }
//         cout<<endl;
//     }
//     int sum=0;
//     int k=0,l=3;
//     for(i=0;i<4;i++)
//     {
//         for(j=0;j<4;j++)
//         {
//             if(i==k&&j==l)
//             {
                
//                 k=k+1;
//                 l=l-1;
//             }
//             else if (i==j)
//             {}
//             else
//             {
//                 sum=sum+a[i][j];
//             }
            
//         }
        
//     }
//     cout<<"\nSum of diagonal 2D array:"<<sum<<endl;
return 0;

}