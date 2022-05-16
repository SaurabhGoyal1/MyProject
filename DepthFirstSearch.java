public class DepthFirstSearch
{
	static int top=-1;
	static int[] stack;
	static boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	static boolean isFull()
	{
		if(top>=stack.length)
			return true;
		else
			return false;
	}
	static void push(int hm)
	{
		if(isFull())
			System.out.println("Full");
		else
		{
			
			stack[++top]=hm;
		}

	}
	static int pop()
	{
		if(isEmpty())
			return 0;
		else
		{
			
			return stack[top--];
		}
	}

	public static void main(String[] args) {
		stack=new int[100];

		int[] visited={-1,-1,-1,-1,-1};

		int[][] graph={
						{0,0,1,0,1},
						{0,0,1,0,0},
						{1,0,0,1,1},
						{0,0,1,0,1},
						{1,1,1,1,1}
					  };
int i=1;
		System.out.print(i+" ");
		visited[i]=1;
		push(i);
		while(!isEmpty())
		{
			int u=pop();
			for(int j=0;j<visited.length;j++)
			{
				if(visited[j]==-1&&graph[u][j]==1)
				{
					System.out.print(j+" ");
					visited[j]=1;
					push(j);
				}

			}
		}

	}

}