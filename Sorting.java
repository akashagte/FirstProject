import java.io.*;
class Sorting 
{public static void main(String args[]) throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int n,i,j,temp;
 System.out.println("Enter no of elements:");
 n=Integer.parseInt(br.readLine());
 int a[]=new int[n];
 System.out.println("Enter elements:");
 for(i=0;i<n;i++)
 {a[i]=Integer.parseInt(br.readLine());
 }
 
 for(i=1;i<=n-1;i++)
 {for(j=0;j<n-i;j++)
 {if (a[j]>a[j+1])
  {temp=a[j];
   a[j]=a[j+1];
   a[j+1]=temp;
   }
   }
  }
 System.out.println("Modified array:");
 for(i=0;i<n;i++)
 {System.out.print(a[i]+" ");
 }
 }
}
