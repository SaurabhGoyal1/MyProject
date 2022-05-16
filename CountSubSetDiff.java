public class CountSubSetDiff//Or Target diff
{
	
	public static int countSubSetSum(int[] arr,int sum,int n)
	{
		int[][]tab=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++)
			tab[i][0]=1;
		for(int i=1;i<sum+1;i++)
			tab[0][i]=0;

		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
				if(sum>=arr[i-1])
				{
					try
					{
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
	public static int diffCount(int[] arr,int diff,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}

		int s1=(diff+sum)/2;
		
		return countSubSetSum(arr,s1,n);



	}


	public static void main(String[] args) 
	{
		int[] arr={0,2,3,4};
		int diff=1;
		int n=arr.length;
		System.out.println(diffCount(arr,diff,n));		
	}
}