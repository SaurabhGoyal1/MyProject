public class GraphDisjoint
{
	int V,E;


	class Edge//it contain source to destination value like as pair{0-->1}
	{
		int src,dest;
	}

	Edge [] edge;//create array to store the object of the Edge class

	//constructor to inisilized all 
	GraphDisjoint(int v,int e)
	{
		V=v;// no of vertice 
		E=e;//no of edges
		edge=new Edge[E];//create array which size of this array is equal to edges
		for(int i=0;i<E;i++)
			edge[i]=new Edge();//store the one by one class Edge in the array
	}


	int find(int[] visitied ,int n)//find the vertice whose belong the group 
	{
		if(visitied[n]==-1)//if value -1 that means vertice value is no belong any group
			return n;
		return find(visitied,visitied[n]);//if vertice belong one group then find another group if again belong same group then recall this function 
	}
	void union(int[] visitied,int x,int y)//when find the value which belong the group then per form union if no cycle contain
	{
		visitied[x]=y;
	}

	//check the graph is cycle or not
	int isCycle(GraphDisjoint gdj)
	{

		int[] visitied=new int[gdj.V];//create visitied array
		for(int i=0;i<gdj.V;i++)
			visitied[i]=-1;//first all the value in the visitied array is -1 


		for(int i=0;i<gdj.E;i++)
		{
			int x=gdj.find(visitied,gdj.edge[i].src);//pick the value from src then find
			int y=gdj.find(visitied,gdj.edge[i].dest);//pick the value from dist then find

			if(x==y)//if src or dest both are same that means this graph contain cycle
				return 1;
			gdj.union(visitied,x,y);//if no match value then perform union operation

		}
		return 0;//retuen 0 when no cycle contain


	}


	public static void main(String[] args)
	{
		int v=4,e=3;
		GraphDisjoint gdj=new GraphDisjoint(v,e);

		gdj.edge[0].src=0;
		gdj.edge[0].dest=1;
		gdj.edge[1].src=1;
		gdj.edge[1].dest=2;
		gdj.edge[2].src=0;
		gdj.edge[2].dest=2;

		if(gdj.isCycle(gdj)==1)
			System.out.print("Cycle");
		else
			System.out.print("Not Cycle");


	}

}