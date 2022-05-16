public class GreaterOrLess
{

	static int[] findsolution(int[] arr,int n)
	{
		int[] arr2=new int[n];
		for(int i=0;i<n;i++)
		{int count1=0;
			int count2=0;
			int temp=0;
			
				for(int j=i;j>0;j--)
				{
					temp=arr[j-1];
					if(arr[i]<temp)
					count1++;
					
				}
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]>arr[j])
					count2++;
				}


			

			if(0>(count1-count2))
				arr2[i]=-1*(count1-count2);
			else
				arr2[i]=count1-count2;

		}
		return arr2;
}





	public static void main(String[] args) {
		int[] arr={4,5,8,6,3};
		int n=arr.length;
		arr=findsolution(arr,n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}