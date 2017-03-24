import java.io.*;
class Merging
{public static void main(String args[]) throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int m,n,i,j,k;
 System.out.println("Enter m and n:");
 m=Integer.parseInt(br.readLine());
 n=Integer.parseInt(br.readLine());
 int a[]=new int[m];
 int b[]=new int[n];
 int c[]=new int[m+n];
 System.out.println("Enter "+m+" nos. in ascending order:");
 for(i=0;i<m;i++)
 {a[i]=Integer.parseInt(br.readLine());
 }
 System.out.println("Enter "+n+" nos. in ascending order:");
 for(i=0;i<n;i++)
 {b[i]=Integer.parseInt(br.readLine());
 }
 i=0;
 j=0;
 k=0;
 
 while(i<m && j<n)
 {if(a[i]<b[j])
  c[k++]=a[i++];
  else
  c[k++]=b[j++];
  }
  
  while(i<m)
  {c[k++]=a[i++];
  }
  while(j<n)
  {c[k++]=b[j++];
  }
  
  for(i=0;i<m+n;i++)
  {System.out.print(c[i]+" ");
  }
  }
 }