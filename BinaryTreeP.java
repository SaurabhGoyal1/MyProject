import java.util.*;
//practice
public class BinaryTreeP
{
	static class Node
	{
		int info;
		Node left,right;
	}
Node root=null;


static void moreThenOneCreate(Node start,Node n)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter position where you add info left or right(l/r): ");
	char ch=sc.next().charAt(0);
	
	if(ch=='r'||ch=='R')
	{
		if(start.right!=null)
		{
			moreThenOneCreate(start.right,n);
		}
		else {
			start.right=n;
		}
	}
	else if(ch=='l'||ch=='L')
	{
		if(start.left!=null)
		{
			create2(start.left,n);
		}
		else {
			start.left=n;
		}
	}


}
	static Node create(Node start,int data)
	{
		Node n=new Node();
		
		n.info=data;
		n.left=null;
		n.right=null;
		if(start==null)
			start=n;
		else
			create2(start,n);
		return start;

	}
	static void inOrder(Node start)
	{
		if(start!=null)
		{
			inOrder(start.left);
			System.out.println(start.info+" ");
			inOrder(start.right);
		}
	}

	public static void main(String[] args) {
		BinaryTreeP btp=new BinaryTreeP();

		btp.root=create(btp.root,2);
		btp.root=create(btp.root,3);
		btp.root=create(btp.root,4);
		btp.root=create(btp.root,5);
		btp.root=create(btp.root,6);
		inOrder(btp.root);
	}

}