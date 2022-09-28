import java.util.*;
public class magic_square {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column of the array :");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int ar[][]=new int[r][c];
        int ld=0,rd=0,ct=0;
        System.out.println("Enter the elements :");
        for(int i=0;i<r;i++)
        {
           
            for(int j=0;j<c;j++)
            {
                ar[i][j]=sc.nextInt();
                
            }
            
        }
        for(int i=0;i<r;i++)
        {
            int s=0,s1=0;
            for(int j=0;j<c;j++)
            {
                s+=ar[i][j];
                s1+=ar[j][i];
                if(i==j)
                ld+=ar[i][j];
                if((i+j)==r-1)
                rd+=ar[i][j];
            }
            
            if(s==s1)
            ct++;
        }
        if((ld==rd)&&ct==r)
        System.out.println("Magic Square");
        else 
        System.out.println("Not Magic Square");
        
    }
}
