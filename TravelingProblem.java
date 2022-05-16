public class TravelingProblem
{
	static int cost=0;
static int lest(int[][]graph,int[]visited,int c )
{
	int nc=2147463647,min=2147463647,kmin=0;
	for(int i=0;i<4;i++)
	{
		if(graph[c][i]!=0&&visited[i]==0&&graph[c][i]+graph[i][c]<min)
		{
			min=graph[i][c]+graph[c][i];
			kmin=graph[c][i];
			nc=i;
		}
	}
	System.out.print(" "+kmin+" ");
	if(min!=2147463647)
		cost+=kmin;
	return nc;
}
	static void traverse(int[][]graph,int index,int[]visited)
		{
			visited[index]=1;
			int nindex=lest(graph,visited,index);
			if(nindex==2147463647)
			{
				nindex=0;
				cost+=graph[index][nindex];
				return;
			}
			traverse(graph,nindex,visited);



		}

	public static void main(String[] args) {
		int[][]graph={{0,10,15,20},{5,0,9,10},{6,13,0,12},{8,8,9,0}};
		int[]visited=new int[4];
		traverse(graph,0,visited);
		System.out.println(cost);
	}
}