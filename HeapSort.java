public class HeapSort
{
	static void heapMax(int []arr,int n,int i)
	{
		int parent=i;
			int left=i*2+1;
			int right=i*2+2;
			if(left<n&&arr[left]>arr[parent])
				parent=left;
			if(right<n&&arr[right]>arr[parent])
				parent=right;

			if(parent!=i)
			{
				int temp=arr[i];
				arr[i]=arr[parent];
				arr[parent]=temp;
				heapMax(arr,n,parent);

			}
	}
	static void delete(int[] arr,int n)
	{
		if(n-1>0)
		{
		int temp=arr[0];
		arr[0]=arr[n-1];
		arr[n-1]=temp;
		int start=n/2-1;
		for(int i=start;i>=0;i--)
		heapMax(arr,n-1,i);
		delete(arr,n-1);
		}

	}

	public static void main(String[] args)
	{

		int[] arr={1,2,7,9,13,22,10};
		int len=arr.length;
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
		

		int start=len/2-1;
		for(int i=start;i>=0;i--)
		heapMax(arr,len,i);
			
			System.out.println();
		
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");

		delete(arr,len);

		System.out.println();
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");




	}
}