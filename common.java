import java.util.*;
class common
{
    public void display(int a[],int b[],int n1,int n2)
    {
        int p=0,count=0;
        int c[]=new int[10];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(a[i]==b[j])
                {
                    c[p]=a[i];
                    p++;
                    count++;
                    break;
                }
            }
        }
        System.out.println("the common elements are:"+count);
        System.out.println("the common elements are:");
        for(int i=0;i<count;i++)
        {
            System.out.println(c[i]);
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first array size:");
        int n1=sc.nextInt();
        int a[]=new int[n1];
         System.out.println(" the first array elements are:");
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.println("enter the second array size:");
        int n2=sc.nextInt();
        int b[]=new int[n2];
         System.out.println(" the second array elements are:");
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        common c=new common();
        c.display(a,b,n1,n2);
    }
}
