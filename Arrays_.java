// import java.util.*;
// class Arrays_
// {
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int arr[] = new int[10];
//         int n =10;
//         for (int i=0;i<n;i++)
//         {
//            arr[i] = sc.nextInt(); 
//         }
//         System.out.println("Array is");
//         for (int i=0;i<n;i++)
//         {
//            System.out.println(arr[i]);
//         }

//         sc.close();
//     }
    
// }
//------------------------------------------------using methods------------
// import java.util.*;
// class Arrays_
// {
//     public void printing(int n , int arr[])
//     {
//         for (int i=0;i<n;i++)
//         {
//            System.out.println(arr[i]);
//         }

//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         Arrays_ a1 = new Arrays_();
        
//         int arr[] = new int[4];
//         int n =4;
//         for (int i=0;i<n;i++)
//         {
//            arr[i] = sc.nextInt(); 
//         }
//         System.out.println("Array is ");
//         a1.printing(n,arr);

//         sc.close();
//     }
    
// }
//--------------------------using multiple methos----------
import java.util.*;
class Arrays_
{

    public void input(int n,int arr[])
    {
        Scanner sc = new Scanner(System.in);
       
        for (int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt(); 
        }
        sc.close();
    }
    public void printing(int n , int arr[])
    {


        for (int i=0;i<n;i++)
        {
           System.out.println(arr[i]);
        }

    }
    
    public static void main(String[] args)
    {
       
        Arrays_ a1 = new Arrays_();
        int n =4;
        int arr[] = new int[n];
;
        
        System.out.println("Array is ");
        a1.input(n,arr);
        a1.printing(n,arr);


       
    }
    
}
