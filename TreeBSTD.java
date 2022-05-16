public class TreeBSTD
{

	static class Node
	{
		int info;
		Node left,right;
	}
	Node root=null;
	static void createNew(Node start,Node n)
	{
		if(start.info<n.info)
			if(start.right!=null)
				createNew(start.right,n);
			else
				start.right=n;
		else
			if(start.left!=null)
				createNew(start.left,n);
			else
				start.left=n;

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
			createNew(start,n);
		return start;

	}

	static void inorder(Node start)
	{
		if(start!=null)
		{
			inorder(start.left);
			System.out.print(start.info+" ");
			inorder(start.right);
		}
	}
	static Node temp;
	static int k=0;
	static void delete(Node start,int data)
	{
		if(start==null)
			return;
		else
		{
			
			if(start.info<data)
			{
				k=0;
				temp=start;
				delete(start.right,data);
			}
			else if(start.info>data)
			{
				k=1;
				temp=start;
				delete(start.left,data);
			}
			else
			{ 
				if(start.right==null&&start.left==null)
					{
						if(k==0)
							temp.right=null;
						else
							temp.left=null;
					}
				else if((start.left==null&&start.right!=null)||(start.left!=null&&start.right==null))
				{
					if(k==1)
					{
					temp.left=start.right;
					start.right=null;
					}
					else
					{
						temp.right=start.left;
						start.left=null;
					}
					
				}
				else if(start.left!=null&&start.right!=null)
				{
					Node temp2=start.right,temp3=start;

					while(temp2.left!=null)
					{ 
							temp3=temp2;
							temp2=temp2.left;
						
					}
					
						if(temp3==start)
						{
							start.info=temp2.info;
							start.right=temp2.right;
						}
						else {
							if(temp2.right!=null)
							{start.info=temp2.info;
								temp3.left=temp2.right;
							}
							else {
								if(temp3.info>=temp2.info)
								{start.info=temp2.info;
									temp3.left=null;
								}
								else
								{start.info=temp2.info;
									temp3.right=null;
								}
								
							}
							
						}
					}
			}

		}

	}

	public static void main(String[] args) {


		TreeBSTD bt=new TreeBSTD();
		bt.root=create(bt.root,100);
		bt.root=create(bt.root,90);
		bt.root=create(bt.root,80);
		bt.root=create(bt.root,115);
		bt.root=create(bt.root,95);
		bt.root=create(bt.root,70);
		bt.root=create(bt.root,79);
		bt.root=create(bt.root,82);
		bt.root=create(bt.root,81);
		bt.root=create(bt.root,105);
		bt.root=create(bt.root,101);
		bt.root=create(bt.root,108);
		bt.root=create(bt.root,140);
		bt.root=create(bt.root,135);
		bt.root=create(bt.root,150);
		inorder(bt.root);
		delete(bt.root,115);
		System.out.println();
		inorder(bt.root);

		
	}
}