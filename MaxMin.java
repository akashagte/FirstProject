import java.io.*;
class MaxMin
{public static void main(String args[]) throws IOException
 {DataInputStream br=new DataInputStream(System.in);
  int a[],i,n;
  System.out.println("Enter no. of elements:");
  n=Integer.parseInt(br.readLine());
  System.out.println("Enter the elements:");
  a=new int[n];
  for(i=0;i<n;i++)
  {a[i]=Integer.parseInt(br.readLine());
  }
  
   maxMin(a,0,n-1,a[0],a[0]);
 }
 
 static int maxMin(int a[],int low,int high,int max,int min)
 {int max1,min1;
  if(low==high)
  {max=min=a[low];
  }
  
  else
  if(low==high-1)
  {if(a[low]>a[high])
   {max=a[low];
    min=a[high];
   }
   else
   {max=a[high]; min=a[low];
   }
  }
  
  else
  {int mid=(low+high)/2;
   maxMin(a,low,mid,max,min);
   maxMin(a,mid+1,high,max1,min1);
   
   if(max1>max)
    {max=max1;
	}
	
   if(min1<min)
    {min=min1;
	 }
	 
	 System.out.println("the max ele is "+max+" & min ele is "+min);
	 }
 return -1;
 }
}

