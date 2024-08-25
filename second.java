import java.util.*;
class second
{
public void second_max(int a[],int n)
{
    int max1=0,max2=0;
    for(int i=0;i<n;i++)
    {
      if(max1<a[i])
      {
          max2=max1;
          max1=a[i];
      }
       if(max2<a[i] && a[i]<max1)
      {
          max2=a[i];
      }
    }
     System.out.println(" the second max is:"+max2);
    
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
    int n=sc.nextInt();
    int a[]=new int[n];
     System.out.println(" the array elements are:");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
     second s=new second();
     s.second_max(a,n);
}
}
