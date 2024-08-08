// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Hello 
{
    public void string(String a[],int n)
    {
        
        for(int i=0;i<n;i++)
        {
            String temp=a[i];
            a[i]=a[n-1];
            a[n-1]=temp;
            n--;
        }
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the string");
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        Hello h=new Hello();
        h.string(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
    
    }
}
