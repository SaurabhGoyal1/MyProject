
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Graph
{
    int V, E;    
    
 
    class Edge
    {
        int src, dest;
    }
    Edge edge[]; 
 
    Graph(int v,int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i=0; i<e; ++i)
            edge[i] = new Edge();
    }

    int find(int parent[], int i)//2
    {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }
 
    void Union(int parent[], int x, int y)
    {
        parent[x] = y;
    }

    int isCycle( Graph graph)
    {
   
        int parent[] = new int[graph.V];
 
  
        for (int i=0; i<graph.V; ++i)
            parent[i]=-1;
 

        for (int i = 0; i < graph.E; ++i)//i=2
        {
            int x = graph.find(parent, graph.edge[i].src);//3
            int y = graph.find(parent, graph.edge[i].dest);//2
 
            if (x == y)
                return 1;
 
            graph.Union(parent, x, y);
        }
        return 0;
    }
 
    // Driver Method
    public static void main (String[] args)
    {
       
        int V = 4, E = 3;
        Graph graph = new Graph(V, E);
 
        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
 
        // add edge 1-2
        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
 
        // add edge 0-2
        graph.edge[2].src = 3;
        graph.edge[2].dest = 2;
 
        if (graph.isCycle(graph)==1)
            System.out.println( "graph contains cycle" );
        else
            System.out.println( "graph doesn't contain cycle" );
    }
}