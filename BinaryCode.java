public class BinaryCode
{

public static void main(String[] args)
{

	int[] arr={1,1,1,1,1,0};
	int a=arr.length;
	int[] arr3={1,1,1,1,1};
	int n=arr3.length,j=0,temp=0;
	char[] arr2=new char[n+1];

	for(int i=0;i<n;i++)
	{
		if((((arr[i]==0||arr[i]==1)&&arr3[i]==0))||((arr3[i]==1&&(arr[i]==0))))
			{
				if(temp==0)
				arr[i]=arr[i]+arr3[i];
				else
				{
					if(arr[i]==0&&arr3[i]==0)
					{
					arr[i]=1;
					temp=0;
					}
					else
					{
						arr[i]=0;
						temp=1;
					}

				}
			}
		else if(arr[i]==1&&arr3[i]==1)
		{
			if(temp==0)
			{
			arr[i]=0;
			temp=1;
			}
			else {
				arr[i]=temp;
				
			}
		}
	}

		arr[a-1]=temp;



	for(int i=0;i<a;i++)
	{
		if(arr[i]==0)
		{
			arr2[i]='@';
		}
		else if(arr[i]==1)
		{
			arr2[i]='#';
		}
	}
	for(int i=a-1;i>=0;i--)
	{
		System.out.print(arr2[i]+" ");
	}




}






}