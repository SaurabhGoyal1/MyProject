public class BreadthFirstSearch
{
	static int f=-1,rear=-1;//initial value of queue
	static int[] queue;
	static boolean isEmpty()
	{//this method check queue is empty or not
		if(f==rear)
			return true;
		else
			return false;
	}
	static boolean isFull()
	{//this method check queue is full or not
		if(rear>=queue.length)
			return true;
		else
			return false;
	}
	static void enQueue(int hm)
	{
		if(isFull())
			System.out.println("Full");
		else
		{
			
			queue[++rear]=hm;
		}

	}
	static int deQueue()
	{
		if(isEmpty())
			return 0;
		else
		{
			
			f++;
			return queue[f];
		}
	}


	public static void main(String[] args) {
		
		queue=new int[100];

		int[] visited={-1,-1,-1,-1,-1};

		int[][] graph={
						{0,0,1,0,1},
						{0,0,1,0,0},
						{1,0,0,1,1},
						{0,0,1,0,1},
						{1,1,1,1,1}
					  };
int i=1;
enQueue(i);//0
visited[i]=1;
System.out.print(i+" ");
while(!isEmpty())
{
int u=deQueue();	//0
for(int j=0;j<visited.length;j++)
	{
		if(visited[j]==-1&&graph[u][j]==1)
		{
			System.out.print(j+" ");
		enQueue(j);
		visited[j]=1;
		}
	}
}








	}



}