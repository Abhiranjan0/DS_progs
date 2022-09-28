import java.util.*;
public class Spiral_matrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column of the array :");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ar[][]=new int[n][m];
        System.out.println("Enter the elements :");
        
        for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
                
            }
            
        }
        int l=0,r=n-1,t=0,b=m-1;
        while(l<=r && t<=b)
		{
		    for( int i =l;i<=r;i++)
		    {
		        System.out.println(ar[t][i]+",");
		    }
		    t++;
		    for( int i =t;i<=b;i++)
		    {
		        System.out.println(ar[i][r]+",");
		        
	     	}r--;
            for(int i=r;i>=l;i--)
            {
                System.out.println(ar[b][i]+",");

            }b--;
            for(int i=b;i>=t;i--)
            {
                System.out.println(ar[i][l]+",");
                
            }l++;
        }
    }
}
        