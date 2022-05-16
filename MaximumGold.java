public class MaximumGold
{
	
	static int max(int a,int b,int c)
	{
		if(a>b&&a>c)
			return a;
		if(b>a&&b>c)
			return b;
		return c;

	}
	static int maxGold(int[][]arr,int n)
	{
		int[][]tab=new int[n+1][n+1];

		for(int i=1;i<n+1;i++)
			tab[i][n]=arr[i-1][n-1];

		int max=Integer.MIN_VALUE;
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<n+1;j++)
			{
				try
				{
				tab[j][i]=max(tab[j-1][i+1],tab[j][i+1],tab[j+1][i+1])+arr[j-1][i-1];
				}
				catch(Exception e)
				{
				tab[j][i]=max(tab[j-1][i+1],tab[j][i+1],0)+arr[j-1][i-1];
				}
			if(tab[j][i]>max)
				max=tab[j][i];

			}
		}
		

		for(int i=0;i<n+1;i++)
			{for(int j=0;j<n+1;j++)
				System.out.print(tab[i][j]+" ");
			System.out.println();
		}

	return max;
	}


	public static void main(String[] args) 
	{
		int[][] arr={
				{0,1,4,2,8,2},
				{4,3,6,5,0,4},
				{1,2,4,1,4,6},
				{2,0,7,3,2,2},
				{3,1,5,9,2,4},
				{2,7,0,8,5,1}};
		int n=arr.length;

		System.out.println(maxGold(arr,n));	
		
	}
}