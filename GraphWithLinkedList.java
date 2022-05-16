import java.util.*;
public class GraphWithLinkedList
{
	public static class Node
	{
		int data;
		Node next;
	}
	Node[] list;

	static Node create(Node start,int j)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the adjecent range of the vertice: "+j+"-> ");

		int n2=sc.nextInt();
		for(int i=0;i<n2;i++)
		{
		Node n=new Node();
		System.out.println("Enter the value: ");
		n.data=sc.nextInt();
		n.next=null;
		if(start==null)
		{
			start=n;
		}
		else
		{
			Node temp=start;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		}
		return start;

	}
static void display(Node[] list2,int n)
{

	for(int i=0;i<n;i++)
	{
		Node temp=list2[i];
		System.out.print("List "+(i+1)+"-> ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

}
public static void main(String[] args)
{
	
	GraphWithLinkedList gwll=new GraphWithLinkedList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range of the vertice for create graph: ");
	int n=sc.nextInt();
	gwll.list=new Node[n];
	for(int i=0;i<n;i++)
	{
		gwll.list[i]=create(gwll.list[i],i+1);
	}
	display(gwll.list,n);




	}
}