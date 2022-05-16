class Graph
{
	public static void main(String[] args) {
		//First Way to solve this problem
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i=0;i<a.length;i++)
		{
			if(i==0||i==a.length-1)
			{	if(i==0)
					{System.out.print("(");
					System.out.print(a[i]);
					System.out.print(",");}
				else 
					{System.out.print(a[i]);
					System.out.print(")");}
			}
			else
				{System.out.print(a[i]);
				System.out.print(")(");
				System.out.print(a[i]);
				System.out.print(",");}
		}

/* Second Way to solve this problem
		int[] a={1,2,3,4,5,6,7,8,9};
		int[] b=new int[a.length*2-2];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==0||i==a.length-1)
			{
				b[j]=a[i];
				j++;
			}
			else
			{
				b[j]=a[i];
				j++;
				b[j]=a[i];
				j++;
			}

		}
		for(int i=0;i<b.length;i++){
			if(i%2==0)
				System.out.print("(");
			System.out.print(b[i]);
			if(i%2==0)
				System.out.print(",");
			else
				System.out.print(")");
*/

		}

}