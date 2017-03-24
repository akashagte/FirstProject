class NQueen
{static int x[]; static int c=0;
 
 static boolean place(int k)
 {int i;
  for(i=1;i<=k-1;i++)
  {if(x[i]==x[k]) return false;
   if (Math.abs(i-k)==Math.abs(x[i]-x[k])) return false;
  }
  return true;
 }
 
 static void nQuee(int n,int k)
 {int i,j;
  for(i=1;i<=n;i++)
  {x[k]=i;
   if(place(k)==true)
   if(k==n)
   {c++;
    for(j=1;j<=n;j++)
	System.out.print(x[j]+" ");
	System.out.println();
	}
	else
	nQuee(n,k+1);
  }
 }
 
 public static void main(String args[])
 {int n=9;
  x=new int[n+1];
  nQuee(n,1);
  System.out.println("Number of Solutions:"+c);
 }
}
