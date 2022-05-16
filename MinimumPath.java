public class MinimumPath
{
	
	static int min(int[][] arr,int n)
	{
		int[][] tab=new int[n+1][n+1];
		int sum=0;
		for(int i=n;i>0;i--)
		{
			sum+=arr[n-1][i-1];
			tab[n][i]=sum;
		}
		sum=tab[n][n];
		for(int i=n-1;i>0;i--)
		{
			sum+=arr[i-1][n-1];
			tab[i][n]=sum;
		}

		for(int i=n-1;i>0;i--)
		{
			for(int j=n-1;j>0;j--)
			{
				tab[i][j]=Math.min(tab[i][j+1],tab[i+1][j])+arr[i-1][j-1];
			}
		}
		return tab[1][1];
	}

	public static void main(String[] args) 
	{
		int[][] arr={
				{2,8,4,1,6,4,2},
				{6,0,9,5,3,8,5},
				{1,4,3,4,0,6,5},
				{6,4,7,2,4,6,1},
				{1,0,3,7,1,2,7},
				{1,5,3,2,3,0,9},
				{2,2,5,1,9,8,2}};
		int n=arr.length;

		System.out.println(min(arr,n));		
	}
}