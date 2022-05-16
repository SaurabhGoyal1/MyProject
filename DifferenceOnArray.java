public class DifferenceOnArray
{

//check number is even 
static boolean even(int data)
	{
		if(data%2==0)
			return true;
		else 
			return false;
	}
	//end

	//check number is odd
	static boolean odd(int data)
	{
		if(data%2!=0)
			return true;
		else
			return false;
	}
	//end

	//check number is odd and prime 
	static boolean oddPrime(int data)
	{
		int count=0;
		if(odd(data))//call odd function if odd then check prime or not 
		{
			for(int i=1;i<=data;i++)
			{
				if(data%i==0)
					count++;
			}
		}
		else //if number is even
			return false;
		if(count==2)//if condition true that number is odd and prime
			return true;
		else 
			return false;//if condition false that number is not odd and prime
	}
	//end

	//check the number is perfect squre or not
	
	static boolean prefSqu(int data)
	{
		int k=0;
		for(int i=1;i<=(int)(data/2);i++)
		{
			if(i*i==data)//if i*i is equels data then data is prefect 
				{
					k=1;
					break;
				}
			else if(i*i>data)//if number is less then of i*i then number is not prefect squre
					break;

		}
		if(k==1)//if number is prefect then do
			return true;
		
		else //if number is not prefect then do
			return false;
	}
	//end

	//check number is odd but not prefect squre
	static boolean oddNprefSqu(int data)
	{
		int k=0;
		if(data%2!=0)//if number is odd then do this
		{k=1;
		if(prefSqu(data))//check number is prefect or not
		{
			k=0;
		}
		}
	else//number is even
		return false;
	if(k==1)//number is odd but not perfect
		return true;
	else
		return false;//if numner is odd but prefect

	}
	//end

	//check all condition for array this is the main block to solve the problem

static int condition(int[] arr)
{
	
	for(int i=0;i<arr.length-1;i++)
	{
		if(even(arr[i])&&oddPrime(arr[i+1]))//this is the first condition to check number must be even , odd and prime then do 
		{
			arr[i+1]=arr[i]+arr[i+1];//performe addition
		}
		else if(odd(arr[i])&&prefSqu(arr[i+1]))// this is the second condition to check number must be odd and prefect squre then do 
		{
			if(arr[i]<arr[i+1])//check number is greater or less
				arr[i+1]=arr[i+1]-arr[i];//performe difference
		else 
			arr[i+1]=arr[i]-arr[i+1];//performe difference
		
		}
		else if(odd(arr[i])&&oddNprefSqu(arr[i+1]))//this is the third condition to check number must be odd , odd and not prefect squre then do 
		{
			arr[i+1]=arr[i]+arr[i+1];//performe addition
		}
		else if(even(arr[i])&&(!oddPrime(arr[i+1])))//this is the first condition to check number must be even , odd and not prime then do 
		{
			if(arr[i]<arr[i+1])//check number is greater or less
			arr[i+1]=arr[i+1]-arr[i];//performe differenec
		else 
			arr[i+1]=arr[i]-arr[i+1];//performe differenec
		}
		else if(odd(arr[i])&&even(arr[i+1]))//this is the first condition to check number must be odd and even then do 
		{
			arr[i+1]=arr[i]*arr[i+1];//performe multiplication
		}

	}
	return arr[arr.length-1];//return the last index value b'z my resultant of the array is store at the last index
}
//end

//main function
public static void main(String[] args)
{
	int[] arr1={3,13,9};//first array
	int[] arr2={25,49,7};//second array
	int resultant1=condition(arr1);//coming to first array of resultant
	int resultant2=condition(arr2);//coming to second array of resultant

	if(resultant1>resultant2)
		System.out.println("The final result of two array="+(resultant1-resultant2));
	else
		System.out.println("The final result of two array="+(resultant2-resultant1));

}
//end 





}
//end