import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }

            int[] out_ = even_odd(N, A);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
            	System.out.print(" " + out_[i_out_]);
            }
            
            System.out.println();
            
         }

         wr.close();
         br.close();
    }
    static int[] even_odd(int N, long[] A){
int []result=new int[N];

       for(int i=0;i<N;i++)
       {int value1=0,value2=0;
           for(int j=0;j<N;j++)
           {
               if(j<i&&A[j]<A[i])
               {
                   value1=value1+(int)A[j];
               }
               if(j<i&&A[j]>A[i])
               {
                   value2++;
               }

           }
           value1=value1+(value2*(int)A[i]);
           if(value1%2==0)
           result[i]=1;
           else
           result[i]=0;

       }
        return result;
    
    }
}