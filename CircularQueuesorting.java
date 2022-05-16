class Queuee
{
	static int f=-1,r=-1;
	static int[] queue=new int[6];
	static int n=queue.length;
	public static boolean isEmpty()
	{
		if(f==-1&&r==-1)
			return true;
		return false;
	}
	public static boolean isFull()
	{
		if(r==n-1&&f==0)
			return true;
		return false;
		
	}
	public static void insert(int data)
	{
		
		if(isFull())
			System.out.println("Full");
		else
		{
			if(f==-1)
			{
			f=1;
			r=0;
			}
			r=(r+1)%n;
			queue[r]=data;
		
			
		}
	}
	public static void delete()
	{
		if(isEmpty())
			System.out.println("Empty");
		else
			f=(f+1)%n;
	}

public static void disp()
{int ff=f;
	if(ff<=r)
		while(ff<=r)
		{
			System.out.print(queue[ff]+" ");
			ff++;
		}
	else 
		{
			while(ff<n)
			{
				System.out.print(queue[ff]+" ");
				ff++;
			}
			ff=0;
			while(ff<=r)
			{
				System.out.print(queue[ff]+" ");
				ff++;
		}}
}




static void sort(int[] queue)
{
	
}









public static void main(String[] args)
{
	insert(6);
	insert(3);
	insert(7);
	disp();
	System.out.println();
	insert(8);
	insert(9);
	disp();
	System.out.println();
	delete();
	delete();
	disp();
	System.out.println();
	insert(1);
	insert(2);
	insert(9);
	disp();
	System.out.println();
	delete();
	disp();
	System.out.println();




	sort(queue);
	
	
}
}