public class DijkstraP
{
	static int v=5;
	static int minval(int[]d,boolean[] check)
	{
		int index=0;
		int min=2147463647;
		for(int i=0;i<v;i++)
		{
		if(check[i]==false&&d[i]<min)
		{
			min=d[i];
			index=i;
		}
	}
		return index;
	}
	static void dijkstra(int[][] graph)
	{
		int[] d=new int[v];
		for(int i=0;i<v;i++)
			d[i]=2147463647;
		d[0]=0;
		int count=0;
		boolean[] check=new boolean[v];
		while(count<v-1)
		{
			int u=minval(d,check);
			check[u]=true;
			for(int i=0;i<v;i++)
			{
				if(graph[u][i]!=0&&d[u]+graph[u][i]<d[i])
				{
					d[i]=d[u]+graph[u][i];

				}
			}
			count++;
		}
		for(int i=0;i<v;i++)
			System.out.println(i+"->"+d[i]);

	}
	public static void main(String[] args) {
		int[][] graph={
						{0,2,0,6,0},
						{2,0,3,8,5},
						{0,3,0,0,7},
						{6,8,0,0,9},
						{0,5,7,9,0}
						};
			dijkstra(graph);
	}
}