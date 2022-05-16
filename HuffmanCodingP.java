public class HuffmanCodingP
{

	static class Node{
		int count;
		char character;
		Node left,right;
	}
static int f=-1,r=-1;
static Node[] queue;
static boolean isEmpty()
{
	if(f==-1)
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

static void enqueue(Node data)
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
static Node dequeue()
{
	if(isEmpty())
		return null;
	else
	{
		Node a=queue[f];
		f++;
		return a;
	}
}
 
 static int partition(Node[] arr,int start,int end)
 {
 	Node pivot=arr[end-1];
 	int index=start;
 	for(int i=start;i<end-1;i++)
 	{
 		if(arr[i].count<=pivot.count)
 		{
 			Node temp=arr[i];
 			arr[i]=arr[index];
 			arr[index]=temp;
 			index++;
 		}
 	}
 	arr[end-1]=arr[index];
 	arr[index]=pivot;
 	return index;
 }
 static void sort(Node[] arr,int start,int end)
 {
 	int index;
 	if(start<end)
 	{
 		index=partition(arr,start,end);
 		sort(arr,start,index-1);
 		sort(arr,index+1,end);
 	}
 }
static void encoding(Node root,String s)
{
if(root!=null)
{
if(root.left==null&&root.right==null)
{
	System.out.println(root.character+"->"+s);
	return;

}
encoding(root.left,s+"0");
encoding(root.right,s+"1");
}
}
static void huffmanCoding(int[] noOfchar,char[] m)
{
	for(int i=0;i<noOfchar.length;i++)
	{
		Node n=new Node();
		n.count=noOfchar[i];
		n.character=m[i];
		n.left=null;
		n.right=null;
		enqueue(n);
	}
	sort(queue,f,r+1);

	for(int i=0;i<noOfchar.length;i++)
	{
		Node x=dequeue();
		Node y=dequeue();
		
		if(x!=null&&y!=null)
		{
		Node n=new Node();
		n.count=x.count+y.count;
		n.left=x;
		n.right=y;
		enqueue(n);
		sort(queue,f,r+1);

		}

		
}

	encoding(queue[r],"");
	




}

static void inorder(Node start)
{
	if(start!=null)
	{
		inorder(start.left);
		System.out.print(start.count+" ");
		inorder(start.right);
	}
}

	public static void main(String[] args) {
		
		queue=new Node[8];
		int[] noOfchar={2,3,4,5};
		char[] m={'A','B','D','C'};
		huffmanCoding(noOfchar,m);

	}














}