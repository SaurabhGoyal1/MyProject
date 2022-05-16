//First Approach
// public class Knapsack01
// {
// 	static int knapsack(int[]wt,int[]pro,int w,int n)
// 	{
// 		if(n==0||w==0)
// 			return 0;
// 		if(w>=wt[n-1])
// 			return (int)Math.max(pro[n-1]+knapsack(wt,pro,w-wt[n-1],n-1),knapsack(wt,pro,w,n-1));
// 		else
// 			return knapsack(wt,pro,w,n-1);
// 	}
// 	public static void main(String[] args) 
// 	{
// 		//       0 1 2 3 4
// 		int[]wt={2,5,4,5,2};
// 		//        0 1 2 3 4
// 		int[]pro={5,6,7,8,2};
// 		int w=8;
// 		int n=wt.length;
// 		System.out.println(knapsack(wt,pro,w,n));
// 	}
// }


//Second Approach
// public class Knapsack01
// {
	
// 	static int[][] m;
// 	static int knapsack(int[]wt,int[]pro,int w,int n)
// 	{
		
// 			if(m[n][w]!=-1)
// 				return m[n][w];
// 		if(n==0||w==0)
// 			return 0;
// 		if(w>=wt[n-1])
// 			return m[n][w]=(int)Math.max(pro[n-1]+knapsack(wt,pro,w-wt[n-1],n-1),knapsack(wt,pro,w,n-1));
// 		else
// 			return m[n][w]=knapsack(wt,pro,w,n-1);
// 	}
// 	public static void main(String[] args)  
// 	{
// 		//       0 1 2 3 4
// 		int[]wt={2,5,4,5,2};
// 		//        0 1 2 3 4
// 		int[]pro={5,6,7,8,2};
// 		int w=8;
// 		int n=wt.length;
// 		m=new int[n+1][w+1];
// 		for(int i=0;i<n+1;i++)
// 		{
// 			for(int j=0;j<w+1;j++)
// 			{
// 				m[i][j]=-1;
// 			}
// 		}
// 		System.out.println(knapsack(wt,pro,w,n));
// 	}
// }

//Third Approach
// public class Knapsack01
// {

// public static int knapsack(int[]wt,int[]pro,int w,int n)
// {
// 	int[][]m=new int[n+1][w+1];
// 	for(int i=0;i<n+1;i++)
// 		{
// 			for(int j=0;j<w+1;j++)
// 			{
// 				if(i==0||j==0)
// 				m[i][j]=0;
// 			}
// 		}
// 		for(int i=1;i<n+1;i++)
// 		{
// 			for(int j=1;j<w+1;j++)
// 			{
// 				if(w>=wt[i-1])
// 					try{
// 					m[i][j]=(int)Math.max(pro[i-1]+m[i-1][j-wt[i-1]],m[i-1][j]);
// 					}
// 					catch(Exception e)
// 					{
// 						m[i][j]=m[i-1][j];
// 					}
// 				else
// 					m[i][j]=m[i-1][j];
// 			}
// 		}
// 		return m[n][w];
// }
// public static void main(String[] args)  
// 	{
// 		//       0 1 2 3 4
// 		int[]wt={2,5,4,5,2};
// 		//        0 1 2 3 4
// 		int[]pro={5,6,1,8,2};
// 		int w=8;
// 		int n=wt.length;
// 		System.out.println(knapsack(wt,pro,w,n));
// 	}
// }
























