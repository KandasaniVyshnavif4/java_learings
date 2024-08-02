import java.util.*;
class Linear
{
    static int key;
    static int n;
    
    
    public void check(int n,int ar[],int key)
    {
        int count = 2;
        for(int i=0;i<n;i++)
        {
            if(ar[i] == key)
            {
                count = 0;
                break;
            }
            else
            {
              count += 1;
            }
        }
        if (count == 0)
        {
            System.out.println("yes found ");
        }
        else{
            System.out.println("not found");
        }
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
    //    Linear l1= new Linear();
       n =sc.nextInt();
    Linear l1 = new Linear();
    System.out.println("enter the key");
        key =sc.nextInt();
       int ar[] =new int[n];
       System.out.println("enter array elements");
       for(int i =0;i<n;i++)
       {
          ar[i] = sc.nextInt();
       }
       l1.check(n,ar,key);
       sc.close();
    }
}