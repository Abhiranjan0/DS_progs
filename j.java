import java.util.*;
public class j
{
    public static void main(String[] args)
    {
        // Day-2 12
        // int N=6;
        //  String s="";
        // for(int i=1;i<=N;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         s=s+Integer.toString(j);
        //     }
        //     for(int j=i-1;j>=1;j--)
        //     {
        //         s=s+Integer.toString(j);
        //     }
        //     s=s+" ";
        //     System.out.println(s);
        // }
        // String str[]=s.split(" ");
        // ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str));
        // return strList;


        
        // int a=1,b=6;
        // for(int i=6;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
           
        //     for(int j=1;j<a;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     if(i==6)
        //    a+=1;
        //    else
        //     a+=2;
        //     if(i==6){
        //     i=5;
        //     for(int j=i;j>=1;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     i=6;
        // }
        //     else 
        //     for(int j=i;j>=1;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //     }
        // int n=16,s=n,i=0;
        // int ar[]=new int[9];
        // ar[0]=s;i++;
        // // ArrayList<Integer> list=new ArrayList<Integer>();
        // while (s>0)
        // {
        //     s=s-5;
        //     ar[i]=s;
        //     i++;
            
        // }
        // while(s<n)
        // {
        //     s=s+5;
        //     ar[i]=s;
        //     i++;
        // }
        // for(int j=0;j<ar.length;j++)
        // System.out.print(ar[j]+" ");
        // int a=5,n=5;;
        // for(int j=0;j<n;j++)
        // {
        //     if(j==0)
        //         for(int i=0;i<n;i++)
        //     {
        //         System.out.print("*");
        //     }
        //     else{
        //     System.out.println();
        //     for(int i=0;i<a-2;i++)
        //     {
        //         System.out.print(" ");
        //     }
        //     a--;
        //     System.out.print("*");
        //     if(j==n-1)
        //         for(int i=0;i<n;i++)
        //     {
        //         System.out.print("*");
        //     }}
        // int N=5;
        // for(int i=0;i<N;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print(" ");
        // }
        // 

        // REpeatition by DAT
        // int ar[]={1,3,4,5,4,3,5};
        // int g=ar[0];
        // for(int i=0;i<ar.length;i++)
        // {
        //     if(ar[i]>g)
        //     g=ar[i];
        // }
        // int a[]=new int[g+1];
        // for(int j=1;j<a.length;j++)
        // {
        //     a[ar[j]]++;
        // }
        // for(int j=1;j<a.length;j++)
        // {
        //     if(a[ar[j]]>1)
        //     System.out.println(j+" is repeated "+a[ar[j]]+" times");
        // }






        //MISING BY DAT
        // int ar[]={1,3,4,5,4,3,5};
        // int g=ar[0];
        // for(int i=0;i<ar.length;i++)
        // {
        //     if(ar[i]>g)
        //     g=ar[i];
        // }
        // int dat[]=new int[g+1];
        // for(int j=0;j<dat.length;j++)
        // {
        //     dat[ar[j]]++;
        // }
        // for(int j=1;j<dat.length;j++)
        // {
        //     if(dat[j]==0)
        //     System.out.println(j+" is missing");
        // }







        String s="actualt",ss="tactual";
        int ar[]=new int[27];
        int f=1;
        System.out.println(s.length());
        System.out.println(ss.length());
        if(s.length()==ss.length())
        {
        for(int i=1;i<s.length();i++)
        {
            ar[s.charAt(i)-'a']++;
        }
        for(int i=1;i<s.length();i++)
        {
            ar[s.charAt(i)-'a']--;
        }
        for(int i=1;i<s.length();i++)
        {
           if(ar[i]!=0) {
           f=0;
           break;}
        }
    if(f==1)
    System.out.println("Anagram");
    else
    System.out.println("Not Anagram");
        }
    else
    System.out.println("Not Anagram");
    
    }
    }
