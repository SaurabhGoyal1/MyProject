//totally cleane and clear code to understanding


public class BinarySearchTreeSecond
{
	//first offall create node 
 class Node
 {
 	int info;//this is the element of the node                    
 	Node left,rigth;//this is the left hand and rigth hand of node[left|info|rigth]
 }

 Node root=null;//this is starting node to asscec the all node


//this function is working like as recurasion it is mainly work to crete more then one nodes
void creteMoreNodes(Node start,Node n)
{
	
	if(start.info>n.info)//check if element is greater then to current node element then go for left b'z this is the rule of binaray tree 
		if(start.left!=null)
			creteMoreNodes(start.left,n);//call recursive
		else
			start.left=n;//put the new node in the left
	else
		if(start.rigth!=null)// less then to current node element then go for rigth b'z this is the rule of binaray tree
			creteMoreNodes(start.rigth,n);//call recursive
		else
			start.rigth=n;// put the node in the rigth
		
}

 Node crete(Node start,int data)//create the node this is the main function
 {
 	Node n=new Node();//crete memory to store the data
 	n.info=data;//put the element into node info
 	n.left=null;
 	n.rigth=null;
 	if(start==null)
 		start=n;//when node cteret first time 
 	else
 		creteMoreNodes(start,n);//crete node more then one 
 	return start;//return start node memory

 }
static Node temp2=null;//globle variable to use this variable hold previous node of the tree
static int k=-1;//this is use for finding the node left or rigth
//delete element in the tree
 Node delete(Node start,int data)
 {
 	if(start!=null)//if tree is not empty then do 
 	{//beging
 		Node temp=start;//assign the node to the temp variable
         
 		if(temp.info>data)//check if data is small from current node then go for left
 			{//beging
 			if(temp.left!=null)//if left is not empty
 			{ 
 				k=0;//for left 
 				temp2=temp;//store the value 
 				delete(temp.left,data);//call function until find the left is null or data
 			}
 			else 
 			{
 				k=0;//for left
 				temp2=temp;//store the node
 				delete(temp.rigth,data);//call function until find the rigth is null or data
 			}
 		}//end
 		//if data is greater then current data then do this
 		else if(temp.info<data)
 		{//beging
 			if(temp.rigth!=null)
 			{
 			k=1;//for rigth
 			temp2=temp;//store the node
 			delete(temp.rigth,data);//call function until find the rigth is null or data
 			}
 			else {
 			k=1;//for rigth
 			temp2=temp;//store the node
 			delete(temp.left,data);//call function until find the left is null or data
 				}
 		}//end
 		//if data is match then do this
 		else if(temp.info==data)
 		{//beging
 		if(temp.left==null&&temp.rigth==null)//no child
 		{//beging
 			if(k==1)//if k==1 do that means delete node's rigth should be null
 				temp2.rigth=null;
 			else if(k==0)//if k==0 do that means delete node's left should be null
 				temp2.left=null;
 		}//end
 		else if(temp.left!=null&&temp.rigth==null)//only one child in left
 			{//beging
 				if(k==1)//if k==1 do that means delete node's rigth should be null
 				{
 				temp2.rigth=temp.left;
 				temp.left=null;

 				}
 			else if(k==0)//if k==0 do that means delete node's left should be null
 				{
 				temp2.left=temp.left;
 				temp.left=null;

 				}
 			}//end
 		else if(temp.left==null&&temp.rigth!=null)//only one child in right
 			{//beging
 			if(k==1)//if k==1 do that means delete node's rigth should be null
 				{
 				temp2.rigth=temp.rigth;
 				temp.rigth=null;
 				}
 			else if(k==0)//if k==0 do that means delete node's left should be null
				{
 				temp2.left=temp.rigth;
 				temp.rigth=null;
				}
			}//end
 		else//for two child left child and rigth child
 		{//beging
 			
 			temp2=temp;//store the node
 			Node temp3=temp.rigth;//go for rigth node
 			while(temp3.left!=null)
 			{
 				temp2=temp3;//store the node again
 				temp3=temp3.left;//move the next left node b'z find last left node which have no child

 			}
 			temp.info=temp3.info;//replace the value which delete the value from the last left node value
 			temp2.left=null;//after replace the value of last left node then cut the link from which link this node
 		

 		}//end
 		
 	}//end
 	
 	
 	}//end
 	return start;//return the start node
 }
//end delete node from tree


//search value from tree 
int c=0;
 int  search(Node start,int data)
 {
 	
 	Node temp=start;
 	if(temp!=null)
 	{
 		if(temp.info==data)
 		{
 			c=1;
 		}
 		else if(temp.info>data)
 		{
 			if(temp.left!=null)
 			{
 				search(temp.left,data);
 			}
 		}
 			
 		else if(temp.info<data)
 		{
 			if(temp.rigth!=null)
 			{
 				search(temp.rigth,data);
 			}
 		}
 		return c;

 	}
 	else
 		return c;
 	
 }
























//it is diplay the element base on the inorder this is traversal of Binary Search Three
 void inorder(Node start)
 {
 	if(start!=null)//if start is not null then it print the all value of the tree
 	{
 		inorder(start.left);//first reach left value
 		System.out.print(start.info+" ");//then print to reach left node value
 		inorder(start.rigth);//move the rigth node
 	}
 }
 //it is diplay the element base on the preorder this is traversal of Binary Search Three
 void preorder(Node start)
 {
 	if(start!=null)//if start is not null then it print the all value of the tree
 	{
 		System.out.print(start.info+" ");//then print the value of first root
 		preorder(start.left);//move the left node
 	
 		preorder(start.rigth);//move the rigth node
 	}
 }
 //it is diplay the element base on the postorder this is traversal of Binary Search Three
 void postorder(Node start)
 {
 	if(start!=null)//if start is not null then it print the all value of the tree
 	{
 		postorder(start.left);//move the left node
 		
 		postorder(start.rigth);//move the rigth node
 		System.out.print(start.info+" ");//then print to reach rigth node value
 	}
 }

public static void main(String[] args)
{
	BinarySearchTreeSecond bsts=new BinarySearchTreeSecond();
	bsts.root=bsts.crete(bsts.root,100);
	bsts.root=bsts.crete(bsts.root,90);                 
	bsts.root=bsts.crete(bsts.root,95);                 
	bsts.root=bsts.crete(bsts.root,50);                
	bsts.root=bsts.crete(bsts.root,85);
	bsts.root=bsts.crete(bsts.root,70);
	
	
	bsts.root=bsts.crete(bsts.root,880);
	bsts.root=bsts.crete(bsts.root,875);
	bsts.root=bsts.crete(bsts.root,990);
	bsts.root=bsts.crete(bsts.root,980);
	bsts.inorder(bsts.root);
	//bsts.root=bsts.delete(bsts.root,990);
	//System.out.println();
	//bsts.inorder(bsts.root);
	int k=bsts.search(bsts.root,980);
	if(k==1)
		System.out.println("\nyes number is valid");
	else
		System.out.println("\nNo number is not valid");
}
}