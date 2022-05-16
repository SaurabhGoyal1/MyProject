public class EqualSetSum
{
	
	public static boolean equalSum(int[]arr,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		if(sum%2!=0)
			return false;
		else
		{
			sum=sum/2;
			boolean[][]graph=new boolean[n+1][sum+1];
			for(int i=0;i<n+1;i++)
			{
				for(int j=0;j<sum+1;j++)
				{
					if(i==0)
						graph[i][j]=false;
					if(j==0)
						graph[i][j]=true;
				}
			}
			for(int i=1;i<n+1;i++)
			{
				for(int j=1;j<sum+1;j++)
				{
					if(sum>=arr[i-1])
						{try{
						graph[i][j]=graph[i-1][j-arr[i-1]]||graph[i-1][j];
					}
					catch (Exception e) {
						graph[i][j]=graph[i-1][j];
					}
					}
					else
						graph[i][j]=graph[i-1][j];
				}
			}
			return graph[n][sum];

		}

	}



	public static void main(String[] args) 
	{

		int[] arr={13,1,6,6};
		int n=arr.length;
		System.out.println(equalSum(arr,n));

	}
}