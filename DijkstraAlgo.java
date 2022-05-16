public class DijkstraAlgo
{
	static int  v=12;

static int minval(int[]d,boolean[] check)
{
	int min=2147483647;
	int min_index=0;
	for(int i=0;i<v;i++)
	{
		if(d[i]<min&&check[i]==false)
			{min=d[i];
			min_index=i;//3

			}
	}
	return min_index;
}
	static void dijkstra(int[][] graph)
	{
		int[] d=new int[v];
		int[] p=new int[5];
		int[] c=new int[v];
		for(int i=0;i<v;i++)
		{
			d[i]=2147483647;
		}
		d[0]=0;//starting vertices
		boolean[] check=new boolean[v];

		int count=0;
		while(count<v-1)
		{
			int u=minval(d,check);//1
			check[u]=true;
			for(int i=0;i<v;i++)
			{
				if(graph[u][i]!=0&&(d[u]+graph[u][i])<d[i])
				{
					d[i]=d[u]+graph[u][i];
					c[u]=i;
				}
			}
			count++;

		}
		p[0]=0;
		p[4]=v-1;
		
			for(int i=1;i<v;i++)
				System.out.println(c[i]+"->");

		for(int i=1;i<4;i++)
			p[i]=d[p[i-1]];
		for(int i=0;i<5;i++)
		{
				System.out.println(p[i]+"->");
		}
	}



	

	public static void main(String[] args) {
		
		int[][] graph={ {0,9,7,3,2,0,0,0,0,0,0,0},
						{0,0,0,0,0,4,2,1,0,0,0,0},
						{0,0,0,0,0,2,7,0,0,0,0,0},
						{0,0,0,0,0,0,0,11,0,0,0,0},
						{0,0,0,0,0,0,11,8,0,0,0,0},
						{0,0,0,0,0,0,0,0,6,5,0,0},
						{0,0,0,0,0,0,0,0,4,3,0,0},
						{0,0,0,0,0,0,0,0,0,5,6,0},
						{0,0,0,0,0,0,0,0,0,0,0,4},
						{0,0,0,0,0,0,0,0,0,0,0,2},
						{0,0,0,0,0,0,0,0,0,0,0,5},
						{0,0,0,0,0,0,0,0,0,0,0,0}
                         };
						
						
						
            dijkstra(graph);

	}
}