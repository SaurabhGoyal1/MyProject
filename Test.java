public class Test
{

		static void arange(int[] arr,int i,int n)
		{
			int largest=i;
			int l=i*2+1;
			int r=i*2+2;
			if(l<n&&arr[largest]<arr[l])
				largest=l;
			if(r<n&&arr[largest]<arr[r])
				largest=r;
			if(largest!=i)
			{
				int temp=arr[i];
				arr[i]=arr[largest];
				arr[largest]=temp;
				arange(arr,largest,n);
				
			}

		}
		static int[] delete(int[] arr,int n)
		{
			if(n>0)
			{
			int temp=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=temp;
			maxHeap(arr,n-1);
			arr=delete(arr,n-1);
		}
		return arr;

		}
		static int[] maxHeap(int[] arr,int n)
		{
			int start=n/2-1;

			for(int i=start;i>=0;i--)
			{
				arange(arr,i,n);
			}
			return arr;

		}



	public static void main(String[] args) {
		int[] arr={3,5,2,6,7,8,9};
		arr=maxHeap(arr,7);
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]+" ");
		}
		arr=delete(arr,7);
		System.out.println();
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}