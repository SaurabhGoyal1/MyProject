//infix to prefix
class Stack
{
	int f=-1,top=-1;
	int[]arr=new int[100];
		
	
	public  boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public  boolean isFull()
	{
		if(top==arr.length-1)
			return true;
		return false;
	}
	public  void push(char data)
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
	public  void pop()
	{
		if(isEmpty())
			System.out.println("Empty");
		else
			top--;
	}
	
	
	public static void main(String[] args)
	{
		Stack s1=new Stack();
		Stack s2=new Stack();
		char ch,ch2;
		String str="3*2+1";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			switch(ch)
			{
				case ')':
				s1.push(ch);
				break;
				case ']':
				s1.push(ch);
				break;
				case '}':
				s1.push(ch);
				break;
				case '-':
				for(int j=s1.top;j>=0;j--)
				{
				if(s1.arr[j]=='*'||s1.arr[j]=='/')
				{
					
					s2.push((char)s1.arr[j]);
					s1.pop();
				}
				else
				{
				s1.push(ch);
				break;
				}
				}
				break;
				case '+':
				for(int j=s1.top;j>=0;j--)
				{
				if(s1.arr[j]=='*'||s1.arr[j]=='/')
				{
					s2.push((char)s1.arr[j]);
					s1.pop();
				}
				else
				{
				s1.push(ch);
				break;
				}
				}
				
				case '*':
				s1.push(ch);
				break;
				case '/':
				s1.push(ch);
				break;
				case '1':
				s2.push(ch);
				break;
				case '2':
				s2.push(ch);
				break;
				case '3':
				s2.push(ch);
				break;
				case '4':
				s2.push(ch);
				break;
				case '5':
				s2.push(ch);
				break;
				case '6':
				s2.push(ch);
				break;
				case '7':
				s2.push(ch);
				break;
				case '8':
				s2.push(ch);
				break;
				case '9':
				s2.push(ch);
				break;
				case '0':
				s2.push(ch);
				break;
				
				case '(':
				for(int j=s1.top;j>=0;j--)
				{if(s1.arr[j]==')'){
				s1.pop();
				break;}
				else
				{
				s2.push((char)s1.arr[j]);
				s1.pop();
				}}
			}
	}
	
	
	
	for(int j=s1.top;j>=0;j--)
	{
		s2.push((char)s1.arr[j]);
		s1.pop();
	}
	for(int j=s2.top;j>=s2.f;j--)
	{
		System.out.print((char)s2.arr[j]);
		
	}
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	