import java.util.*;
class difference
{
    public static void main(String[] args)
    {
    int i=0,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size and elements of first array:");
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int x=0;x<m;x++)
		{
		    a[x]=sc.nextInt();
		}
		System.out.println("Enter the size and elements of second array:");
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int y=0;y<n;y++)
		{
		    b[y]=sc.nextInt();
		}
		int c[]=new int[m+n];
		while(i<m)
		{
		    if(a[i]<b[j])
		    {
                c[k]=a[i];
            
		        i++;
		        k++;
		    }
		    else if(b[j]<a[i])
		    {
		        
		        
		        j++;
		    }
		    else 
		    {
		        
		        
		        i++;
		        j++;
		    }
		}	
       
		System.out.print("A-B ==");
		for(int l=0;l<k;l++)
	    {
	        System.out.print(c[l]+",");
	    }
		i=0;j=0;k=0;
        int c1[]=new int[m+n];
        while(j<n)
		{
		    if(a[i]<b[j])
		    {
                
                i++;
		        
		    }
		    else if(b[j]<a[i])
		    {
		        c1[k]=a[i];
		        k++;
		        j++;
		    }
		    else 
		    {
		        
		        
		        i++;
		        j++;
		    }
		}	
        
		System.out.print("B-A =="); 
		for(int l=0;l<k;l++)
	    {
	        System.out.print(c1[l]+",");
	    }
		i=0;j=0;k=0;
        int r[]=new int[m+n];
		while(i<c.length&&i<c1.length)
		{
		    if(a[i]<b[j])
		    {
                r[k]=c[i];
		        i++;
		        k++;
		    }
		    else if(b[j]<a[i])
		    {
		        
		        r[k]=c1[j];
				k++;
		        j++;
		    }
		    else 
		    {
		        i++;
		        j++;
		    }
		}	
        while(i<c.length)
		{
		    r[k]=c[i];
		    k++;
		    i++;
		}
		while(j<c1.length)
		{
		    r[k]=c[i];
		    k++;
		    j++;
		}
        i=0;j=0;k=0;
		System.out.print("LAST ");
	    for(int l=0;l<k;l++)
	    {
	        System.out.print(r[l]+",");
	    }
    }
}
