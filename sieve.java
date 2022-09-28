import java.util.*;
class sieve
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  end limit." );
        int s=sc.nextInt();
        int l=sc.nextInt();
        int ar[]=new int[l+1];
        for(int i=2;i<=l;i++)
        {
            ar[i]=0;
        }
        for(int i=2;i*i<=l;i++)
        {
            if(ar[i]==0)
            {
                for(int j=i*i;j<=l;j+=i)
                {
                    ar[j]=1;
                }
            }
        }
        for(int i=s;i<=l;i++)
        {
            if(ar[i]==0)
            System.out.println(i);
        }
    }
}