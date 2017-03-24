import java.util.*;
class Factorial
{public static void main(String args[])
{Scanner k=new Scanner(System.in);
 int n,i,fact;
 System.out.println("Enter 'n':");
 n=k.nextInt();
 fact=1;
 for(i=1;i<=n;i++)
 {fact=fact*i;
 }
 System.out.println(fact);
 }
}
