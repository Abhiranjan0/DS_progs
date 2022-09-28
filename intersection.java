import java.util.*;
class intersection
{
    public static void main(String[] args) {
	    int i=0,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size and elements of first array:");
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int x=0;x<m;x++)
		{
		    a[x]=sc.nextInt();
		}
		System.out.println("Enter the size and elements of first array:");
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int y=0;y<n;y++)
		{
		    b[y]=sc.nextInt();
		}
		int c[]=new int[m+n];
		while(i<(int)Math.min(m,n))
		{
		    if(a[i]<b[j])
		    {
		    
		        i++;
		        
		    }
		    else if(b[j]<a[i])
		    {
		        
		        
		        j++;
		    }
		    else 
		    {
		        c[k]=a[i];
		        k++;
		        i++;
		        j++;
		    }
		}	
	    for(int l=0;l<k;l++)
	    {
	        System.out.print(c[l]+",");
	    }
	}
}

