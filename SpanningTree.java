import java.util.Scanner;
public class SpanningTreeK
{


	static class Graph
	{//this is weighted graph 
	//this class contain information of the graph
		int weight,src,dest;
	}
	static Graph[] edge;//make a array to store the graph class
	static int V,E;//this variable is use for no of vertices and no of edges
	static void createEdge(int s,int d,int w,int i)
	{//create a graph with weighted
		Graph g=new Graph();
		g.src=s;
		g.dest=d;
		g.weight=w;
		edge[i]=g;//store the every graph object

	}
//performe sorting b'z minimum spanning tree give first priority smallest weight
//i use merge sort by sorting elements
static void merge(Graph[] arr,Graph[] left,Graph[] right)
{
	int i=0,j=0,k=0;
	while(i<left.length&&j<right.length)
	{
		if(left[i].weight>right[j].weight)
		{
			arr[k]=right[j];
			j++;
		}
		else
		{
			arr[k]=left[i];
			i++;
		}
		k++;
	}
	while(i<left.length)
	{
		arr[k]=left[i];
		i++;
		k++;
	}
	while(j<right.length)
	{
		arr[k]=right[j];
		j++;
		k++;
	}
}
	static void sort(Graph[] arr,int E)
	{

		if(E<2)
			return;
		else
		{
			int mid=E/2;
			Graph[] left=new Graph[mid];
			Graph[] right=new Graph[E-mid];
			for(int i=0;i<mid;i++)
				left[i]=arr[i];
			for(int i=mid;i<E;i++)
				right[i-mid]=arr[i];
			sort(left,left.length);
			sort(right,right.length);
			merge(arr,left,right);

		}
			
	}
	//end of the sort function
		
	//this function find that who is the parent of the next edge 
   static int find(int parent[], int i)
    {
        if(parent[i] == -1)
            return i;//this is the parent
        return find(parent, parent[i]);
    }
 	//this function work to merge two or more edges
   static void Union(int parent[], int x, int y)
    {
        parent[x] = y;
    }
    //this function work to find minimum cost
    static int minimum(Graph[] arr)
    {
    	int sum=0;
   		
        int parent[] = new int[V];//create parent array b'z all edge store inside
 		for (int i=0; i<V;i++)
            parent[i]=-1;//first of all initilization -1 no relation
 

        for (int i =0; i<E;i++)
        {int k=0;
            int x =find(parent, arr[i].src);//check who is the parent
            int y =find(parent, arr[i].dest);//check who is the parent
 
            if (x == y)//if group is same then contain cycle
                k=1;//minimum spanning tree avoid cycle
            if(k==0)//no cycle
            {
            	Union(parent, x, y);//then perform union
            	sum=sum+arr[i].weight;//sum of the weight
            	//System.out.print(arr[i].weight+" ");//testing perpus
            }
 
            
        }
        return sum;//this is the minimum cost of the my tree
        
    
    }
	//this is main function
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of the vertices:");
		V=sc.nextInt();
		System.out.println("Enter the range of the Edges:");
		E=sc.nextInt();
		edge=new Graph[E];

		for(int i=0;i<E;i++)
		{//inside I am working to take input from user
			System.out.println(i+1+" Enter the source from:");
			int s=sc.nextInt();
			System.out.println(i+1+" Enter the distination to:");
			int d=sc.nextInt();
			System.out.println(i+1+" Enter the weight "+s+"->"+d+":");
			int w=sc.nextInt();
			//after above taking input then call the function
			createEdge(s,d,w,i);//this

		}
		sort(edge,E);//after above operation complete then sort the element
		//print the minimum cost of the tree 
		System.out.println(minimum(edge));
	}
	
    
	
}//end of the SpanningTree