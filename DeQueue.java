public class DeQueue
{
static int rear,front;
static int [] queue;
static boolean isEmpty()
{
	if(rear==front||rear==-1)
		return true;
	else
		return false;
}

static boolean isFull()
{
	if(rear==queue.length-1&&front==0)
		return true;
	else
		return false;
}

static void enqueueRear(int data)
{
	if(isFull())
	{
		return;
	}
	else
	{
		if(front==0)
			front=1;
		rear=(rear+1)%queue.length;
		queue[rear]=data;

	}


}

static void dequeueFront()
{
	if(isEmpty())
	{
		return;
	}
	else
	{
		front=(front+1)%queue.length;
	}
}




static void enqueuefront(int data)
{
	if(isFull())
	{
		return;
	}
	else
	{
		if(front==0)
			front=queue.length;
		front=(front-1)%queue.length;
		queue[front]=data;

	}


}

static void dequeueRear()
{
	if(isEmpty())
	{
		return;
	}
	else
	{
		if(rear==0)
			rear=queue.length;
		rear=(rear-1)%queue.length;

	}


}

static void display()
{
	if(isEmpty())
		System.out.println("Empty");
	else
	{
		if(front<=rear)
			for(int i=front;i<=rear;i++)
				System.out.print(queue[i]);
		else{
			int frontemp=front;
			
			for(int i=frontemp;i<queue.length;i++)
				System.out.print(queue[i]);

			frontemp=0;
			for(int i=frontemp;i<=rear;i++)
				System.out.print(queue[i]);

		}
	}
}

public static void main(String[] args)
{
	
	queue=new int[100];
	enqueueRear(1);
	enqueueRear(2);
	enqueueRear(3);
	display();
	System.out.println();
	enqueueRear(4);
	display();
	System.out.println();
	dequeueRear();
	dequeueRear();

	display();
	System.out.println();

	enqueuefront(5);
	enqueuefront(6);
	enqueuefront(7);
	display();
	System.out.println();
	dequeueFront();
	display();
	System.out.println();
	enqueueRear(8);
	display();
	System.out.println();
	enqueuefront(9);
	display();
	System.out.println();


}









}