class BFS
{
	static int front=-1,rear=-1;
	static int[]q;
	static boolean isEmpty()
	{
		if(rear==-1||front==rear)
			return true;
		return false;
	}
	static boolean isFull()
	{
		if(rear==q.length-1)
			return true;
		return false;
	}
	static void enQueue(int data)
	{
		if(isFull())
			System.out.println("Full");
		else 
		{
			++rear;
			q[rear]=data;
		}	
	}
	static int delete()
	{
		if(isEmpty())
			return -1;
		else
		{
			++front;
			return q[front];
		}


	}
	public static void main(String[] args)
	{
		q=new int[1000];
		int u;
		int i=7;
		int[] visitied={0,0,0,0,0,0,0,0};

		int[][] arr={ {0,0,1,0,1,0,1,0},
					  {0,0,0,1,0,0,0,1},
					  {1,0,1,0,0,0,1,0},
					  {0,1,0,1,0,1,0,1},
					  {1,0,1,0,1,0,0,0},
					  {0,1,0,1,0,1,0,0},
					  {1,0,1,0,1,0,0,0},
					  {0,1,0,1,0,0,0,1}
					};
		System.out.print(i);
		visitied[i]=1;
		enQueue(i);
		while(!isEmpty())
		{ 
			int j;
			u=delete();
			for(j=0;j<8;j++)
			{
				if(arr[u][j]==1&&visitied[j]==0)
				{
					System.out.print(j);
					visitied[j]=1;
					enQueue(j);
				}
			}

		}

	}
}