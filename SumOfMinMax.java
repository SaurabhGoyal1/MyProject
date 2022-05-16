public class SumOfMinMax
{ 
    public static int findSum(int A[],int N) 
    {
        int pickMax=A[0];
        int pickMin=A[0];
       for(int i=1;i<N;i++)
       {
           if(pickMax<A[i])
            pickMax=A[i];
           if(pickMin>A[i])
            pickMin=A[i];
       }
       return pickMax+pickMin;
    }
    public static void main(String[] args) {
        int[] arr={1,-3,-4,5,6,-7};
        int size=arr.length;
        System.out.println(findSum(arr,size));
    }
}
