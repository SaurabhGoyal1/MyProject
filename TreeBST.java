public class TreeBST
{
static int v=5;
static int minVal(int[]d,boolean[] check)
{
	int min=2147483647;
	int min_index=0;
	for(int i=0;i<v;i++)
	{
		if(d[i]<min&&check[i]==false)
		{
			min=d[i];
			min_index=i;
		}
	}
	return min_index;
}
static void dijkstra(int[][] graph)
{
	int[] d=new int[v];
	for(int i=0;i<v;i++)
		d[i]=2147483647;
	d[0]=0;
	boolean[] check=new boolean[v];
	int count=0;
	while(count<v)
	{
		int u=minVal(d,check);
		check[u]=true;
		for(int i=0;i<v;i++)
		{
			if(graph[u][i]!=0&&check[i]==false&&(d[u]+graph[u][i])<d[i])
			{
				d[i]=d[u]+graph[u][i];
			}
		}
		count++;

	}
	for(int i=0;i<v;i++)
		{	if(check[i]==true)
				System.out.println(i+1+"->"+d[i]);
		}
}


public static void main(String[] args) {
	
		int[][] graph={
						{0,2,1,6,0},
                        {2,0,3,8,5},
                        {0,3,6,0,8},
                        {6,8,0,0,9},
                        {0,5,7,9,0}
		};
		dijkstra(graph);




	}
}