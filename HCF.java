public class HCF
{
	static int hcf(int a,int b)
	{
		if(a%b==0)
			return b;
		if(a>b)
			return hcf(b,a%b);
		return hcf(b,a);
	}


	public static void main(String[] args) {
	
	int a=35;
	int b=100;
	System.out.println(hcf(a,b));

	}
}