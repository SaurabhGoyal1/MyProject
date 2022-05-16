public class Test 
{
	static int hello()
	{
	
	int[][] arr={{1,-1,-1,-1},{0,0,0,0},{0,0,-1},{0,0,-1,2}};
	int [] arr2=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{int count=0;
		for(int j=0;j<arr[i].length;j++)
		{
			
			if(arr[i][j]==1||arr[i][j]==0||arr[i][j]==2)
			{
				count++;
			}
		
		}
		arr2[i]=count;
	}
	for(int i=0;i<arr2.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr2[j]>arr2[j+1]){
				int temp=arr2[j];
			
			arr2[j]=arr2[j+1];
			arr2[j+1]=temp;}
		}
	}
	
	return arr2[0];

	}
public static void main(String[] args)
{
	 System.out.println(hello());


	}

	
}

