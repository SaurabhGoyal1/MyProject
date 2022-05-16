public class SubSetSum
{
	
	public static boolean sum(int[]arr,int sum,int n)
	{
		boolean[][] graph=new boolean[n+1][sum+1];
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
				{
					try{
					graph[i][j]=graph[i-1][j-arr[i-1]]||graph[i-1][j];
				}
				catch(Exception e)
				{
					graph[i][j]=graph[i-1][j];
				}

				}
				else
					graph[i][j]=graph[i-1][j];
			}
		}
		return graph[n][sum];

	}


	public static void main(String[] args) {
	
	int[] arr={1,2,2,1,4};
	int sum=10;
	int n=arr.length;
	System.out.println(sum(arr,sum,n));	
	}
}