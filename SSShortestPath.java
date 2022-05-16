public class SSShortestPath
{
	static int v=7;
		static void singleSource(int[][] graph)
		{
			int[] key=new int[v];
			for(int i=0;i<v;i++)
				key[i]=2147473647;
			int count=0;
			key[0]=0;
			while(count<v-1)
			{
				for(int i=0;i<v;i++)
				{
					for(int j=0;j<v;j++)
					{

						if(graph[i][j]!=0&&key[i]+graph[i][j]<key[j])
							key[j]=key[i]+graph[i][j];
					}
				}
				count++;
			}
			for(int i=0;i<v;i++)
				System.out.println(i+1+"->"+key[i]);
		}




	public static void main(String[] args) {
		int[][] graph={
						{0,6,5,5,0,0,0},
						{0,0,0,0,-1,0,0},
						{0,-2,0,0,1,0,0},
						{0,0,-2,0,0,-1,0},
						{0,0,0,0,0,0,3},
						{0,0,0,0,0,0,3},
						{0,0,0,0,0,0,0}
					  };
					  singleSource(graph);
	}
}