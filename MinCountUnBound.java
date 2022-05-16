public class MinCountUnBound
{

	static int coinChange(int[] coin,int sum,int n)
	{
		int[][] tab=new int[n+1][sum+1];
		for(int i=0;i<sum+1;i++)
			tab[0][i]=2147483646;
		for(int i=1;i<sum+1;i++)
			if(i%coin[0]==0)
				tab[1][i]=i/coin[0];
			else
				tab[1][i]=2147483646;
		for(int i=2;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
				if(j>=coin[i-1])
					tab[i][j]=(int)Math.min(tab[i][j-coin[i-1]]+1,tab[i-1][j]);
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