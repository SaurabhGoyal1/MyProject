import java.util.*;
public class SpanningTreeP2
{
	static int V=5;
	static class Edge
	{
		int src;
		int dest;
		int weight;
	}
	static Edge[] egdepair;

	static void sort()
	{
		for(int i=1;i<V;i++)
		{
			int index=i;
			Edge key=egdepair[i];
			while(index>0&&egdepair[index-1].weight>key.weight)
			{
				egdepair[index]=egdepair[index-1];
				index--;
			}
			
			egdepair[index]=key;

		}

	}
	static void create(int i)
	{
		Edge e=new Edge();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("For First Node "+(i)+":");
		System.out.println("Enter the source form "+(i)+":");
		e.src=sc.nextInt();

		System.out.println("Enter the destination to "+(i)+":");
		e.dest=sc.nextInt();
		System.out.println("Enter the weight from "+e.src+"to"+e.dest+":");
		e.weight=sc.nextInt();
		egdepair[i]=e;

	}
	static int find(int[] parent,int i)
	{
		if(parent[i]==-1)
			return i;
		return find(parent,parent[i]);
	}
	static void union(int[] parent,int x,int y)
	{
		parent[x]=y;
	}
	static int shortest()
	{
		int[] parent={-1,-1,-1,-1,-1};
		int sum=0;
		for(int i=0;i<V;i++)
		{
			int x=find(parent,egdepair[i].src);
			int y=find(parent,egdepair[i].dest);

			if(x==y)
				continue;
			System.out.println(egdepair[i].weight);
			sum+=egdepair[i].weight;

			union(parent,x,y);
		}
		return sum;
	}

	public static void main(String[] args) {
		egdepair=new Edge[V];

		for(int i=0;i<V;i++)
			create(i);
		sort();
		System.out.println(shortest());




	}
}