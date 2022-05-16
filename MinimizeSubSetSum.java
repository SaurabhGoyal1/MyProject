public class MinimizeSubSetSum
{
	public static boolean[][]sumSetSum(int[]arr,int sum,int n)
	{
		boolean[][] tab=new boolean[n+1][sum+1];

		for(int i=0;i<n+1;i++)
		{
			tab[i][0]=true;
		}
		for(int i=1;i<sum+1;i++)
		{
			tab[0][i]=false;
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
				if(sum>=arr[i-1])
					try{
						tab[i][j]=tab[i-1][j-arr[i-1]]||tab[i-1][j];
					}
					catch (Exception e) {
						tab[i][j]=tab[i-1][j];
					}
					else
						tab[i][j]=tab[i-1][j];
			}
		}
		return tab;

	}
	public static int minimize(int[]arr,int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		boolean[][]tab=new boolean[n+1][sum+1];
		tab=sumSetSum(arr,sum,n);
		int diff=0;
		for(int i=sum/2;i>=0;i--)
		{
			if(tab[n][i]==true)
			{
				diff=sum-(2*i);
				break;
			}
		}
		return diff;
	}


	public static void main(String[] args) 
	{
		int[] arr={2,2,5,7};
		int n=arr.length;
		
		System.out.println("\n"+minimize(arr,n));
	}
}