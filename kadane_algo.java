import java.util.*;
public class kadane_algo {
    public static void main(String args[])
    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of the array :");
        int r=sc.nextInt();
        int ar[]=new int[r];
        System.out.println("Enter the elements :");
        
        for(int i=0;i<r;i++)
        {
            ar[i]=sc.nextInt();         
        }
        int sum=0,max_sum=0;
        for(int i=0;i<r;i++)
        {
            sum=sum+ar[i];
            if(sum>max_sum)
            max_sum=sum;
            if(sum<0)
            sum=0;
        }
        System.out.println(max_sum);
    }
    
}
