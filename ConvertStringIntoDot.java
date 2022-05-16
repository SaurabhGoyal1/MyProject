//Welcome Saurabh Goyal
//W.S.G


import java.util.*;
public class ConvertStringIntoDot {
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your string: "); 
String s=sc.nextLine();
int l=s.length();
String w="";
int count=0;
for(int i=0;i<l;i++)
	{
		if(s.charAt(i)!=' ')
		{
			w=""+s.charAt(i);
			count=i;
			break;
		}
		else
			w="";
	}
	if(!w.equals(""))
	{
	for(int i=count;i<l-1;i++)
	{
		char ch=s.charAt(i);
		if(ch==' ')
		{
			if(s.charAt(i+1)!=' ')
			{
				w=w+"."+s.charAt(i+1);
				
			}
		}
	}
}
System.out.println("Result = "+w);
}
}