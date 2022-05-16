import java.io.*;
class FindPerticularFile
{
	public static void main(String[] args) 
	{
		File f=new File("C:\\Users\\Saurabh\\Desktop\\JavaDsProgram");
		String[] s=f.list();

		for(String s1:s)
		{	
			int count=0;

			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)=='.')
					break;
				count++;
			}
		if(s1.substring(count).equals(".class"))
		System.out.println(s1);
			
		}	
			
	}
}