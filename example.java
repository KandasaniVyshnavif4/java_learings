import java.util.*;
class example
{
    int n;
     Scanner sc=new Scanner(System.in);
    public void set( int n,int arr[])
    {
       
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void sum( int n,int arr[])
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println("the sum is"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
       int n= sc.nextInt();
         int arr[]=new int[n];
        example e=new example();
        e.set(n,arr);
        e.sum(n,arr);
    }
}
