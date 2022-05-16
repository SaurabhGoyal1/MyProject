public class Test2
{
	static int hello()
	{
		int n=5;
		int[] arr={3,2,4,3,3};
		int temp=0,temp2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				temp2=arr[i];//3
				temp=temp+arr[i];//6
				for(int j=i+1;j<n;j++)
				{//3+1=4     4          //3-1=2  2
				if(((temp2+1)==arr[j])||((temp2-1)==arr[j]))
				{
					arr[j]=0;

				}
			}
			}
			

		}
return temp;
	}
	public static void main(String[] args)
{
	 System.out.println(hello());


	}
}