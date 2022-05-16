public class UnBoundKnapsackRodCutting
{
	

	public static int rodCutting(int[] len,int[] val,int n)
	{
		int[][] tab=new int[n+1][n+1];

		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				if(j>=len[i-1])
					tab[i][j]=(int)Math.max(val[i-1]+tab[i][j-len[i-1]],tab[i-1][j]);
					
					else
						tab[i][j]=tab[i-1][j];
			}

		}
		return tab[n][n];
	}




	public static void main(String[] args) {
	
		int[] len={1,2,3,4,5,6,7,8};
		int[] val={0,3,2,7,6,3,8,1};
		int n=8;
		System.out.println(rodCutting(len,val,n));

	}
}