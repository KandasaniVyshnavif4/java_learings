import java.util.*;
class hari
{
    int n;
    public void  pro(int a[],int n)
    {
        
        for(int i=0;i<n;i++)
        {
         int temp=a[i];
           a[i]=a[n-1];
           a[n-1]=temp;
           n--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
      int  n=sc.nextInt();
       System.out.println("enter the array elements");
   int [] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   hari h=new hari();
   h.pro(a,n);
   System.out.println("the array after reversing is:");
   for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  
     }
}
