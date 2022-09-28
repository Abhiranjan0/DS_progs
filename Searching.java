import java.util.*;

import javax.sound.midi.Sequence;
class Searching {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements in Array :");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to be searched");
        int t=sc.nextInt();
        linear_search(ar,t);
        binary_search(ar,t);
        ternary_search(ar,t);
        jump_search(ar,t);
        exponential_search(ar,t);
        interpolation_search(ar,t);
        Sequenceindex_search(ar,t);
    }
    static void linear_search(int ar[], int s)
    {
        int f=-1,i=0;
        for( i=0;i<ar.length;i++)
        {
            if(ar[i]==s)
            {
                f=0;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("NUmber found.");
        }
        else 
        {
            System.out.println("Number not found");
        }
    }
    static void binary_search(int ar[],int s)
    {
        int f=0,m=0;
        int l=0,h=ar.length-1;
        while(l<=h)
        {
            m=(l+h)/2;
            if(ar[m]==s)
            {
                f=1;
                break;
            }
            else if(ar[m]>s)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        if(f==1)
        {
            System.out.println("Element found.");
        }
        else 
        System.out.println("Element not found.");
    }
    static void ternary_search(int ar[],int s)
    {
        int f=-1;
        int l=0,h=ar.length-1;
        while(l<=h)
        {
            int m1=l+(h-l)/3,m2=h-(h-l)/3;
            if(ar[m1]==s)
            {
                f=1;
                break;
            }
            else if(ar[m2]==s)
            {
                f=1;
                break;
            }
            else if(ar[m1]>s)
            {
                h=m1-1;
            }
            else if(ar[m2]<s)
            {
                l=m2+1;
            }
            else
                {
                    l=m1+1;
                    h=m2-1;
                }

        }
        if(f==1)
        System.out.println("Element found.");
        else 
        System.out.println("Element not found.");

    } 
    static void jump_search(int ar[],int s)
    {
        int f=-1,m=0;
			int step=(int)Math.sqrt(ar.length-1);
			while(m<=ar.length-1)
            {
				if(ar[m]==s)
				{
					f=1;
					break;
				}
				else if(ar[m]<s)
				m+=step;
				else 
				{
                    for(int j=m-step;j<m+step;j++)
                    {
                        if(s==ar[j])
                        {f=1;
                        break;}
                    }
			    }
                if(f==1)
                break;
            }
            if(f==1)
            System.out.println("Element found.");
            else 
            System.out.println("Element not found.");
        }
        static void exponential_search(int ar[],int s)
        {
            int i=1,n=ar.length;
            if(ar[0]==s)
            {
                System.out.println("Element found at : 0 index");
            }
            else{
                while(i<n && ar[i]<=s)
                i*=2;

                System.out.println("Element found at :"+Arrays.binarySearch(ar,i/2,(int)Math.min(i,n-1),s)+" index ");
            }
        }
        static void interpolation_search(int ar[],int s)
        {

            // int p=
        }


        static void Sequenceindex_search(int ar[],int s)
        {
            int l=ar.length/3,a=0;
            int arr[]=new int[l];
            for(int i=0;i<ar.length;i+=3)
            {
                arr[a++]=i;
            }
            int j=0,f=0;;
            while(j<l)
            {
                if(ar[arr[j]]==s)
                {
                    f=1;
                    break;
                }
                else if(ar[arr[j]]<s)
                {
                j++;
                if(j==l) 
                for(int i=arr[j-1];i<ar.length;i++)
                {
                    if(ar[i]==s)
                    {f=1;
                    j++;
                    break;
                    }
                }
            }
            else
            for(int i=arr[j-1];i<ar.length;i++)
                {
                    if(ar[i]==s)
                    {f=1;
                    j++;
                    break;
                    }
                }
            }
            if(f==1)
            System.out.println("Element found.");
            else 
            System.out.println("Element not found. ");
        }
    
    }
