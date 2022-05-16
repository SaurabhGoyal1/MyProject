//floyd warshall's algo
public class AllPSP
{

	static void allpsp(int[][] graph)
	{
		for(int k=0;k<4;k++)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(i==k)
						break;
					if(i!=j&&k!=j)
					{
						if(graph[i][j]>graph[i][k]+graph[k][j])
							graph[i][j]=graph[i][k]+graph[k][j];
					}
				}
			}
		}
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
		int[][] graph={{0,3,2147463647,7},{8,0,2,2147463647},{5,2147463647,0,1},{2,2147463647,2147463647,0}};
		
		allpsp(graph);


	}
}