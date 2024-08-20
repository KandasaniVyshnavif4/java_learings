import java.util.*;
public class Second 
{
    int n;
    
    public int   first(int a[])
    {
        int max = a[0];
        for(int i =1;i<a.length;i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        //System.out.println("maximum is "+"   :  "+max);
        return max;

    }
    public int[]   next(int n,int a[],int max)
    {
       //int n, =4;
        
        int b[] = new int[10];
        int index = 0;
        for (int i =0;i<n;i++)
        {
            if(a[i] != max)
            {
                b[index++] = a[i];
            }
        }
        //for(int l : b)
        //System.out.println(l);      
        return b;  
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[10];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        Second s = new Second();
      int j = s.first(a);
       int b[]= s.next(n,a,j);
        int second_max = s.first(b);
        System.out.println("second maximum in an array is "+second_max);
        sc.close();
    }

}
