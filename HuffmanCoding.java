/*
Enter the message:SAURABH GOYAL
G:000
O:001
A:01
Y:100
S:1010
U:1011
R:1100
B:1101
H:1110
 :1111
this is my last output
*/

import java.util.Scanner;
//this program convert into message to code using Huffmancoding
public class HuffmanCoding
{//the main class of huffmancoding

static class Huffman{
	//it store the information of the message 
		int data;
		char ch;
		Huffman left,right;
	}
	static Huffman[] queue;//create array to store the object 
	//of Huffman class which contain some data to related message
	
	//maintain queue b'z we have a need to sorte and delete the object like as queue form
	
	static int f=-1,rear=-1;//initial value of queue
	static boolean isEmpty()
	{//this method check queue is empty or not
		if(f==-1)
			return true;
		else
			return false;
	}
	static boolean isFull()
	{//this method check queue is full or not
		if(rear>=queue.length)
			return true;
		else
			return false;
	}
	static void enQueue(Huffman hm)
	{//store the object of huffman class
		if(isFull())
			System.out.println("Full");
		else
		{
			if(rear==-1)
				f=0;
			queue[++rear]=hm;
		}

	}
	static Huffman deQueue()
	{//delete the object and return which we delete object b'z we use this object to link new object   
		if(isEmpty())
			return null;
		else
		{
			Huffman a=queue[f];
			f++;
			return a;
		}
	}

//sorting by quick sort approach
static int partition(Huffman[] queue,int start,int end)
{
Huffman pvoit=queue[end-1];
int index=start;
for(int i=start;i<end-1;i++)
{
	if(queue[i].data<=pvoit.data)
	{
		Huffman temp=queue[i];
		queue[i]=queue[index];
		queue[index]=temp;
		index++;
	}
	}
queue[end-1]=queue[index];
	queue[index]=pvoit;
return index;

}
	static void sort(Huffman[] queue,int start,int end)
	{
		int intdex;
		if(start<end)
		{

		intdex=partition(queue,start,end);
		sort(queue,start,intdex-1);
		sort(queue,intdex+1,end);
	}

	}
//end sorting
	
Huffman root=null;//it is starting root of the tree which the maximum value object which came after encoding  

static void create(int info,char c)
	{// this method store the value one by one which will we work 
		Huffman hn=new Huffman();
		hn.data=info;
		hn.ch=c;
		hn.left=null;
		hn.right=null;
		enQueue(hn);
	}
	
static Huffman createHuffman(Huffman start,int n,int[] re,char[] al)
{
	//this is the main function to all perform the opertation 
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<n;i++)
	{//this for taking input by user
		create(re[i],al[i]);
	}
	sort(queue,0,n);//first we sorted our queue
	
	for(int i=0;i<n;i++)
	{//this method to add child value and create the new value
		Huffman x=deQueue();//this is the first smallest object in the queue
		Huffman y=deQueue();//this is the second smallest object in the queue
		if(x!=null&&y!=null)
		{
		Huffman hu=new Huffman();//create new object 
		hu.data=x.data+y.data;//add the value to store new object
		hu.left=x;//after above operation complete then link the first smallest object to the new object in the left 
		hu.right=y;//after above operation complete then link the second smallest object to the new object in the right
		enQueue(hu);//store new object in the queue
		sort(queue,f,rear+1);//perform sorting after above operation
		}
	}
	return start=queue[rear];//return the last queue object b'z all the control of object have only last object then so we made root of this object   
}
static void enCodeing(Huffman start,String s)
{//print the code corrsponding character

if(start!=null)
{
if(start.left==null&&start.right==null&&(start.ch=='0'||start.ch=='1'||start.ch=='2'||start.ch=='3'||start.ch=='4'||start.ch=='5'||start.ch=='6'||start.ch=='7'||start.ch=='8'||start.ch=='9'||start.ch==' '||start.ch=='A'||start.ch=='B'||start.ch=='C'||start.ch=='D'||start.ch=='E'||start.ch=='F'||start.ch=='G'||start.ch=='H'||start.ch=='I'||start.ch=='J'||start.ch=='K'||start.ch=='L'||start.ch=='M'||start.ch=='N'||start.ch=='O'||start.ch=='P'||start.ch=='Q'||start.ch=='R'||start.ch=='S'||start.ch=='T'||start.ch=='U'||start.ch=='V'||start.ch=='W'||start.ch=='X'||start.ch=='Y'||start.ch=='Z'||start.ch=='a'||start.ch=='b'||start.ch=='c'||start.ch=='d'||start.ch=='e'||start.ch=='f'||start.ch=='g'||start.ch=='h'||start.ch=='i'||start.ch=='j'||start.ch=='k'||start.ch=='l'||start.ch=='m'||start.ch=='n'||start.ch=='o'||start.ch=='p'||start.ch=='q'||start.ch=='r'||start.ch=='s'||start.ch=='t'||start.ch=='u'||start.ch=='v'||start.ch=='w'||start.ch=='x'||start.ch=='y'||start.ch=='z'))
		{
			System.out.println(start.ch+":"+s);
			return;
			
		}
		enCodeing(start.left,s+"0");
		enCodeing(start.right,s+"1");
	}

}
public static void main(String[] args) 
	{
		HuffmanCoding hmc=new HuffmanCoding();
		Scanner sc=new Scanner(System.in);
		int[] re=new int[70];
		char[] al=new char[70];
		int n=0; 
		System.out.print("Enter the message:");
		String s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++)
		{	int k=0;
			int count=0;
			char ch=s.charAt(i);
			
			for(int j=0;j<n;j++)
				if(ch==al[j])
					k=1;
			if(k==1)
				continue;


			for(int j=i+1;j<s.length();j++)
			{
			if(ch==s.charAt(j))
				count++;
			}

			re[n]=count+1;
			al[n]=ch;
			n++;
		}
		queue=new Huffman[n*2];

		hmc.root=createHuffman(hmc.root,n,re,al);
		enCodeing(hmc.root,"");
	}
}