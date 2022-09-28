
import java.util.*;
public class weekday {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,ly=0;
		System.out.println("Enter the day of the date:");
		int d=sc.nextInt();
		System.out.println("Enter the month of the date:");
		int m=sc.nextInt();
		System.out.println("Enter the year of the date:");
		int y=sc.nextInt();
		for(int i=1;i<m;i++)
		{
		    if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
		    {
		         if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		         n+=31;
		         else if(i==4||i==6||i==9||i==11)
		         n+=30;
		         else 
		         n=n+28;
		    }
		    else
		    {
		         if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		         n+=31;
		         else if(i==4||i==6||i==9||i==11)
		         n+=30;
		         else 
		         n=n+29;
		    }
		}
		    for(int i=2001;i<y;i++)
		    {
		        if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
		        ly+=1;
		    }
		    int t=d+n+ly*366+(y-ly)*365;
		    switch(t%7)
		    {
		        case 0:
		            System.out.println("Sunday");
		            break;
		        case 1:
		            System.out.println("Monday");
		            break;
		        case 2:
		            System.out.println("Tuesday");
		            break;
		        case 3:
		            System.out.println("Wednesday");
		            break;
		        case 4:
		            System.out.println("Thursday");
		            break;
		        case 5:
		            System.out.println("Friday");
		            break;
		        case 6:
		            System.out.println("Saturday");
		            break;
		        default:
		            System.out.println("______");
		    }
		}
	}

