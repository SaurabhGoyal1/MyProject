public class AllPairOFGraph
{
// static int[][] allSP(int[][] graph)
// {
// for(int l=0;l<4;l++)
// {
// 	for(int i=0;i<4;i++)
// 	{
// 		for(int j=0;j<4;j++)
// 		{
// 			if(i!=j&&l!=j)
// 			{
// 				if(graph[i][j]>graph[i][l]+graph[l][j])
// 					graph[i][j]=graph[i][l]+graph[l][j];

// 			}
// 		}
// 	}
// }
// 	return graph;

// }	
static int[][] allSP(int[][] graph,int l)
{
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(i!=j&&l!=j)
			{
				if(graph[i][j]>graph[i][l]+graph[l][j])
					graph[i][j]=graph[i][l]+graph[l][j];

			}
		}
	}
	return graph;

}
static void printG(int[][]graph)
{
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
		System.out.print(graph[i][j]+" ");
		}
		System.out.println();
	}
}


	public static void main(String[] args) {
		int NIF=2147473647;
		int[][] graph0={
						{0,3,NIF,7},
						{8,0,2,NIF},
						{5,NIF,0,1},
						{2,NIF,NIF,0}
					  };
	
	printG(graph0);				  
	System.out.println();
	
	int[][] graph1=allSP(graph0,0);
	printG(graph1);
	System.out.println();


	int[][] graph2=allSP(graph1,1);
	printG(graph2);
	System.out.println();


	int[][] graph3=allSP(graph2,2);
	printG(graph3);
	System.out.println();
	
	int[][] graph4=allSP(graph3,3);
	printG(graph4);
	System.out.println();


	}
}