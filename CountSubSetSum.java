public class CountSubSetSum
{
	
	public static int countSubSet(int[]arr,int n,int sum)
	{
		int[][] tab=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<sum+1;j++)
			{
				if(i==0)
					tab[i][j]=0;
				if(j==0)
					tab[i][j]=1;
			}
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
				if(sum>=arr[i-1])
				{
					try{
						tab[i][j]=tab[i-1][j-arr[i-1]]+tab[i-1][j];
					}
					catch (Exception e) {
						tab[i][j]=tab[i-1][j];
					}
				}
				else
					tab[i][j]=tab[i-1][j];
			}
		}
		return tab[n][sum];
	}


	public static void main(String[] args) 
	{
		int[] arr={1,2,3,5,6,2};
		int n=arr.length;
		int sum=10;
		System.out.println(countSubSet(arr,n,sum));		
	}
}