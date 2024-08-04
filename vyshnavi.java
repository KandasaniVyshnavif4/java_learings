import java.util.*;
class vyshnavi
{
    int n;
    public void  pro(int []a,int key)
    {
        int p=0;
        int r=n-1;
        
      while(p<=r)
      {
            int q=(p+r)/2;
          if(a[q]==key)
          {
              System.out.println("the elelment is found at index"+q);
              break;
          }
          else if(key<a[q])
          {
              r=q-1;
          }
          else
          {
              p=q+1;
          }
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
   vyshnavi h=new vyshnavi();
   h.n=n;
   System.out.println("enter the element u want to search");
   int key=sc.nextInt();
   h.pro(a,key);
     }
}
