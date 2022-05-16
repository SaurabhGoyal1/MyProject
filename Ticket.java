import java.util.*;
class Ticket 
{
	public static void main(String[] args)
	{
		int no_of_counter;
		Scanner sc=new Scanner(System.in);
		no_of_counter=sc.nextInt();
		int[] counter=new int[no_of_counter];
		for(int i=0;i<no_of_counter;i++)
		{
			counter[i]=sc.nextInt();
		}
		for(int i=0;i<no_of_counter;i++)
		{int count=0;
			int n=counter[i];
			int[] arr=new int[100];
			System.out.print(n+" ");
			int j=0;
			while(n>0)
			{
			if(n%2==0)
			{
				arr[j]=n;
				n=n/2;
				count=count+1;
				j++;
			}
			else
			{
				arr[j]=n;
				n=n-1;
				count=count+1;
				j++;
			}
			}
			arr[j]=n;
			for(j=0;j<=count;j++)
				System.out.print(arr[j]+"->");
				
		System.out.println(" "+count);
		}
	}
}
			
		
		
		
		