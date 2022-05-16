public class BFSP
{



	static double knapsack(int[] profit,int[]weight,int w)
	{
		double[] minmum=new double[profit.length];
		double sum=0;
		for(int i=0;i<profit.length;i++)
			minmum[i]=(double)profit[i]/weight[i];
		for(int i=0;i<profit.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<profit.length;j++)
			{
				if(minmum[index]<minmum[j])
				{
					index=j;
				}

			}
			if(weight[index]<=w)
			{
				sum=sum+profit[index];
				w=w-weight[index];
			}
			else if(weight[index]>w&&w!=0)
			{
				sum=sum+(double)w*minmum[index];
				System.out.println(minmum[index]);
				w=0;
			}
			if(w==0)
				break;
					double temp=minmum[i];
					minmum[i]=minmum[index];
					minmum[index]=temp;
					int temp2=profit[i];
					profit[i]=profit[index];
					profit[index]=temp2;
					int temp3=weight[i];
					weight[i]=weight[index];
					weight[index]=temp3;

		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] profit={20,30,40,50};
		int[] weight={15,36,25,2};
		int w=40;
		System.out.println(knapsack(profit,weight,w));
	}
}