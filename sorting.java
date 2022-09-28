import java.util.*; 
class sorting {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int ar[]=new int[n];
        
        int g=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            Bubble_sort(ar);
        }
        int dat[]=new int[g+1];
        for(int i=0;i<ar.length;i++)
        {
            dat[ar[i]]++;
        }
        int c[]=new int[ar.length];
        for(int i=1;i<=g;i++)
        {
            dat[i]=dat[i]+dat[i-1];
        }
        for(int i=0;i<ar.length;i++)
        {
            c[dat[ar[i]]-1]=ar[i];
            dat[ar[i]]--;
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(c[i]+",");
        }

        int l=0,r=n-1;
         mergesort(ar,l,r);
         Insertionsort(ar);
    }
    static void Bubble_sort(int ar[])
            {
            int temp,flag=1;
            for(int i=0;i<ar.length;i++)
            {
                flag=0;
                for(int j=0;i<ar.length-i-1;j++)
                {
                    if(ar[j]>ar[j-1])
                    {
                        temp=ar[j];
                        ar[j]=ar[j+1];
                        ar[j+1]=temp;
                        flag=1;
                    }
                }
            }
            for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]);
        }





        //merge sort
        public static void mergesort(int cd [],int beg, int end)
    {
        int mid;
        if(beg<end)
        {
            mid=(beg+end)/2;
            mergesort(cd,beg,mid);
            mergesort(cd,mid+1,end);
            merge(cd,beg,mid,end);
        }


    }

    
     public static void merge(int cd[],int beg,int mid,int end)
    {
        int la[]=new int[mid-beg+1];
        int ra[]=new int[end-mid];
        for(int i=0;i<la.length;i++)
        la[i]=cd[beg+i];
        for(int j=0;j<ra.length;j++)
        ra[j]=cd[mid+1+j];
        int i=0;
        int j=0;
        int k=beg;
        while(i<la.length&&j<ra.length)
        {
            if(la[i]<=ra[j])
            cd[k++]=la[i++];
            else
            cd[k++]=ra[j++];
        }
            while(i<la.length)
            cd[k++]=la[i++];
            while(j<ra.length)
            cd[k++]=ra[j++];
        }


        //insertion sort
        static void Insertionsort(int ar[]) {
        int key=0;
        for(int i=1 ;i<ar.length;i++)
        {
            key=ar[i];
            int j=i-1;
            while(j>=0&&ar[j]>key)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;


        }
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+",");

    }
    
}
