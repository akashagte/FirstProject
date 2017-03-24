import java.io.*;
class RMerSort
{static void merge(int a[],int low,int mid,int high)
 {int i,j,k;
  int b[]=new int[a.length];
  
  i=low;k=low;j=mid+1;
  
  while(i<=mid&&j<=high)
  {if(a[i]<=a[j])
   b[k++]=a[i++];
   else
   b[k++]=a[j++];
  }
  
  while(i<=mid)
   b[k++]=a[i++];
  while(j<=high)
	b[k++]=a[j++];

	for(i=low;i<=high;++i)
	{a[i]=b[i];
	}
 }
 
 static void mSort(int a[],int low,int high)
 {int mid;
  if(low<high)
  {mid=(high+low)/2;
   mSort(a,low,mid);
   mSort(a,mid+1,high);
   merge(a,low,mid,high);
   }
  }
  
  public static void main(String args[]) throws IOException
  {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int a[],i,n;
   
   System.out.println("Enter no of elements:");
   n=Integer.parseInt(br.readLine());
   a=new int[n];
   System.out.println("Enter elements:");
   for(i=0;i<n;i++)
   {a[i]=Integer.parseInt(br.readLine());
   }
   
   mSort(a,0,n-1);
   
   System.out.println("SORTED LIST:");
   for(i=0;i<n;i++)
   System.out.print(a[i]+" ");
  }
 }
 
 