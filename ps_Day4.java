import java.util.*;
public class ps_Day4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and end limits: ");
        int s=sc.nextInt();
        int l=sc.nextInt();
        for(int i=s;i<=l;i++)
        {
            armstrong(i);
        }
    }
    static void armstrong(int a)
    {
        int r=0,s=0;
        for(int i=a;i>0;i/=10)
        {
            r=(int)Math.pow((i%10),3);
            s+=r;
        }
        if(s==a)
            System.out.println(a+" is Armstrong.");
    }
}
