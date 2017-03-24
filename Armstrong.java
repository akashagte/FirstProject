import java.util.*;
class Armstrong
{public static void main(String args[])
{Scanner sc=new Scanner(System.in);
 int n,d,sum,t;
 System.out.println("Enter an integer:");
 n=sc.nextInt();
 t=n;
 sum=0;
 
 while(n!=0)
 {d=n%10;
  sum=sum+d*d*d;
  n=n/10;
  }
  if(sum==t)
  {System.out.println("ARMSTRONG NUMBER.");
  }
  else
  {System.out.println("NOT AN ARMSTRONG NUMBER.");
  }
  }
 }
