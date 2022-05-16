//By Using Dynamic Programming
public class LCSR
{
	static int lcs(String x,String y,int n,int m)
	{
		int[][] tab=new int[n+1][m+1];
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<m+1;j++)
			{

				if(x.charAt(i-1)==y.charAt(j-1))
					 tab[i][j]=tab[i-1][j-1]+1;
				else
					 tab[i][j]=(int)Math.max(tab[i-1][j],tab[i][j-1]);
			}
		}
		return tab[n][m];

	}
	public static void main(String[] args) {
		String x="absbdfb";
		String y="sdfsdfb";
		System.out.println(lcs(x,y,x.length(),y.length()));
	}
}




//By Using Memoization
// public class LCSR
// {
// 	static int[][] me;
// 	static int lcs(String x,String y,int n,int m)
// 	{
// 		if(n==0||m==0)
// 			return 0;
// 		if(me[n][m]!=-1)
// 			return me[n][m];
// 		if(x.charAt(n-1)==y.charAt(m-1))
// 			return me[n][m]=lcs(x,y,n-1,m-1)+1;
// 		else
// 			return me[n][m]=(int)Math.max(lcs(x,y,n-1,m),lcs(x,y,n,m-1));

// 	}
// 	public static void main(String[] args) {
// 		String x="absbdfb";
// 		String y="sdfsdfb";
// 		me=new int[x.length()+1][y.length()+1];
// 		for(int i=0;i<x.length()+1;i++)
// 		{
// 			for(int j=0;j<y.length()+1;j++)
// 			{
// 				me[i][j]=-1;
// 			}
// 		}
// 		System.out.println(lcs(x,y,x.length(),y.length()));
// 	}
// }
//By Using Recursion
// public class LCSR
// {
// 	static int lcs(String x,String y,int n,int m)
// 	{
// 		if(n==0||m==0)
// 			return 0;
// 		if(x.charAt(n-1)==y.charAt(m-1))
// 			return lcs(x,y,n-1,m-1)+1;
// 		else
// 			return (int)Math.max(lcs(x,y,n-1,m),lcs(x,y,n,m-1));

// 	}
// 	public static void main(String[] args) {
// 		String x="absbdfb";
// 		String y="sdfsdfb";
// 		System.out.println(lcs(x,y,x.length(),y.length()));
// 	}
// }