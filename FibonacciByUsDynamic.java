public class FibonacciByUsDynamic
{
	static int[] arr={-1,-1,-1,-1,-1,-1};
	static int fibo(int n)
	{
		if(n==1||n==0)
		{
			return n;
		}
		else if(arr[n]==-1)
		{

			arr[n-2]=fibo(n-2);
			
			arr[n-1]=fibo(n-1);
			
		}

			arr[n]=arr[n-2]+arr[n-1];
			return arr[n];

		

	}
	public static void main(String[] args)
	 {


		System.out.println(fibo(5));
		for(int i=0;i<6;i++)
	 	{
	 		System.out.print(arr[i]+" ");
	 	}
	}
}
