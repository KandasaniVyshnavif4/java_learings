import java.util.*;
class duplicate
{
    public int remove(int a[],int n)
    {
        int p=n;
        for(int i=0;i<p;i++)
        {
            
            for(int j=i+1;j<p;j++)
            {
                if(a[i]==a[j])
                {
                    for(int k=j;k<p-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                         j--;
                    p--;
                }
            }
        }
        return p;
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      duplicate d=new duplicate();
    int p= d.remove(a,n);
       System.out.println("the array after removing duplicates");
       for(int i=0;i<p;i++)
       {
           System.out.println(a[i]);
      
    }
}
}
