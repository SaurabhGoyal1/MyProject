public class Test4
{
	static int hello()
	{
		int num=15;
		int n=6;
		int postion=0,k=0;
		          //0 1 2 3 4 5
		int[] arr={5,6,7,9,15,4};

	for(int i=0;i<n;i++)//
	{
		postion=0;//
		if(arr[i]==num)
		{
			
			postion++;
			break;
		}
		else{
		for(int j=i+1;j<n;j++)//
		{    
			arr[i]=arr[i]+arr[j];//
			postion=postion+1;//
			if(arr[i]==num)
			{
				k=1;
				postion++;//6
				break;
			}
			else if(arr[i]>num)
			{
				System.out.print("Hil");
				break;
			}


		}}
		if(k==1)
		{
			break;
		}
	}
	return postion;//6
	}
public static void main(String[] args)
{
	 System.out.println(hello());


	}

	
}