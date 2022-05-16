public class BinarytoCode
{ 
	public static void main(String[] args)
	 {

		int n=12;
	 	String str="";

	 	while(n>0)
	 	{
	 		if(n%2==0)
	 			str=str+"@";
	 		else
	 			str=str+"#";
	 		n=n/2;
	 	}



	 	
	 	//first method
	 	// StringBuffer str1=new StringBuffer();
	 	// str1.append(str);
	 	// System.out.println(str1.reverse());
	 	
	 	// second method
	 	// for(int i=str.length()-1;i>=0;i--)
	 	// {
	 	// 	System.out.print(str.charAt(i));
	 	// }
	 	



	}	
}



