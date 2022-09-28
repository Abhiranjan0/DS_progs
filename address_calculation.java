import java.util.*;
public class address_calculation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1d array:");
        int n1=sc.nextInt();
        int ar[]=new int[n1];
        System.out.println("Enter the bazse address of array, size of 1 element and index to be found :");
        int ba=sc.nextInt();
        int size=sc.nextInt();
        int i=sc.nextInt();
        address_1d(ba,size,i);

        //address 2d array
    //     System.out.println("Enter the upper and lower limits of the row of the array:");
    //     int u1=sc.nextInt();
    //     int ar[]=new int[n1];
    //     System.out.println("Enter the elements :");
    //     for(int i=0;i<n1;i++)
    //     {
    //         ar[i]=sc.nextInt();
    //     }
     }
    static void address_1d(int ba,int size,int i)
    {
        System.out.println(ba+(i-1)*size);
    }
}
