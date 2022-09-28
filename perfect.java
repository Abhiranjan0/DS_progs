import java.util.*;
public class perfect {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int s=sc.nextInt();
        int l=sc.nextInt();
        int c=0;
        for(int i=s;i<=l;i++)
        {
            c=perfect(i);
        if(c==i)
        System.out.println(i);
        }
    }
    static int perfect(int n)
    {
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            c+=i;
        }
        return c;
    }
}
