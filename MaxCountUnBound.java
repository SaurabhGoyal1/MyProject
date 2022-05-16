public class MaxCountUnBound
{

	static int coinChange(int[] coin,int sum,int n)
	{
		int[][] tab=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++)
			tab[i][0]=1;
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
				if(j>=coin[i-1])
					tab[i][j]=tab[i][j-coin[i-1]]+tab[i-1][j];
				else
					tab[i][j]=tab[i-1][j];
			}
		}
		return tab[n][sum];
	}


	public static void main(String[] args) {
	
	int[] coin={1,2,3};
	int sum=5;
	System.out.println(coinChange(coin,sum,coin.length));
	}
}