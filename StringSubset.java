import java.util.*;
public class StringSubset
{

	static void possibleString(String S[], int n) 
{ 
    int subset_size =(int) Math.pow(2, n);
    //Run from index 000..0 to 111..1
    for(int i=0;i<subset_size;i++) 
    {
        String subset[]=new String[n];
        for(int j=0;j<n;j++)
        { 
       
            
                subset[j] = S[j];
        }
        for(String s:subset)
        	if(s!=null)
       System.out.println(s);
    }
}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		String str=sc.nextLine();
		String[]str2=sc.nextLine().split(",");
		
		possibleString(str2,n);

		
	}
}