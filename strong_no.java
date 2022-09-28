import java.util.*;
public class strong_no {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two no.");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int lf=0;
        System.out.println(gcd(n,m));
    }
    static int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
    
}
