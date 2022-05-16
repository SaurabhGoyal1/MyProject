class Stack
{
	
	 static int f=-1,top=-1;
	 static int[]arr=new int[100];
		
	
	public static boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public static boolean isFull()
	{
		if(top==arr.length-1)
			return true;
		return false;
	}
	public static void push(char data)
	{
		if(isFull())
			System.out.println("Full");
		else
		{
			top++;
			arr[top]=data;
			f=0;
		}
	}
	public static void pop()
	{
		if(isEmpty())
			System.out.println("Empty");
		else
			top--;
	}
	public static void main(String[] args)
	{	
		char ch;
		int k=0;
		
	String str="((A}+B+(C){})+D}";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			switch(ch)
			{
				case '(':
				push(ch);
				break;
				case '[':
				push(ch);
				break;
				case '{':
				push(ch);
				break;
				case ')':
				if(arr[top]=='(')
				pop();
				k=1;
				break;
				case ']':
				if(arr[top]=='[')
				pop();
				k=1;
				break;
				case '}':
			if(arr[top]=='{')
				pop();
				k=1;
				break;
			}
			if(k==1)
				break;
			
		}
		if(top==-1)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}
}