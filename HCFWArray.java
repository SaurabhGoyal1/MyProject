public class HCFWArray
{
	static int f=-1,r=-1;
static int[] queue;
static boolean isEmpty()
{
	if(f==-1||r==f)
		return true;
	else
		return false;
}
static boolean isFull()
{
	if(r>=queue.length)
		return true;
	else
		return false;
}

static void enQueue(int data)
{
	if(isFull())
		return;
	else
	{
		if(f==-1)
			f=0;
		queue[++r]=data;
	}
}
static int deQueue()
{
	if(isEmpty())
		return -1;
	else
	{
		int a=queue[f];
		f++;
		return a;
	}
}
static int hcf(int a,int b)
	{
		if(a%b==0)
			return b;
		if(a>b)
			return hcf(b,a%b);
		return hcf(b,a);
	}
	

	public static int findHCF(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
			enQueue(arr[i]);
		for(int i=0;i<n;i++)
		{
			int x=deQueue();
			int y=deQueue();
			if(x!=-1&&y!=-1)
			{
			enQueue(hcf(x,y));
			sort(queue);
			}
		}
		return queue[r];
	}
public static void sort(int[] B)
	{
		for(int i=f;i<r;i++)
		{
			for(int j=i;j<r;j++)
			{
			  	if(B[j]<B[j+1])
			  	{
			  		int temp=B[j];
			  		B[j]=B[j+1];
			  		B[j+1]=temp;
			  	}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[]arr={1232,456,234,134,56};// 5 5
		queue=new int[13];

		System.out.println(findHCF(arr,arr.length));
	}
}