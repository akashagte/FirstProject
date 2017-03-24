import  java.io.*;
class PatternMatch1
{
   static int  bm(String  text,String pattern)
   {int i,j;
     int  last []=new int [128];
      for(i=0;i<128;i++)
         last[i]=-1;
       for(i=0;i<pattern.length();i++)
            last[pattern.charAt(i)]=i;
  
      int n=text.length();
      int  m=pattern.length();

      i=m-1;
      if(i>n-1)  
               return -1;//pattern larger than text   so  not found
       j=m-1;
       do
            {
              if(pattern.charAt(j)==text.charAt(i))
                   {  if(j==0)
                               return  i;//found pattern in text
                     else
                               {
                                 i--;
                                 j--;
                               }
                     }
                else
                       {
                          i=i+m-Math.min(j,1+last[text.charAt(i)]);
                          j=m-1;
                       }
             }
        while(i<=n-1);
       return -1;//not  found
    }


 public static void main(String args[])throws  IOException

  {
     BufferedReader  br=new BufferedReader(new  InputStreamReader(System.in));
      String  text,pattern;
      System.out.println("Eneter  Text");
        text=br.readLine();
        
      System.out.println("Enter Pattern");
        pattern=br.readLine();
       int k=bm(text,pattern);
        if(k<0)
                   System.out.println("Not  a Pattern");
         else
                    System.out.println(pattern+ "  is   a pattern  of  "+ text);
     }
 }     