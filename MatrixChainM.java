public class MatrixChainM
{
	static int[][] m;
    static int mul(int[] arr,int i,int j)
    {
    	if(i>=j)
    		return 0;
    	if(m[i][j]!=-1)
    		return m[i][j];
    	int min=2147483647;
    	for(int k=i;k<j;k++)
    	{
    		int temp=mul(arr,i,k)+mul(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
    		if(temp<min)
    			min=temp;
    	}
    	return m[i][j]=min;
    	
    }

	public static void main(String[] args) {
		m=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				m[i][j]=-1;
			}
		}
			int[] arr={20,30,40,50,67};
			System.out.println(mul(arr,1,4));
			for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		}	
}