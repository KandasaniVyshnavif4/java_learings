// //Write a Java program to find the maximum and minimum values in an array of integers.
//write a Java program to find the sum of all the elements of an array.

import java.util.Scanner;

public class All {
    public void max_min(int[] a) {
        int max = a[0];
        int min = a[0];
        
        for (int j : a) {
            if (min > j) {
                min = j;
            }
        }
        
        for (int k : a) {
            if (max < k) {
                max = k;
            }
        }
        
        System.out.println("max is " + max + "\nmin is " + min);
    }

    public void Sum_ele(int a[])
    {
      int sum = 0;
        for(int r:a)
        {
          sum += r;
        }
        System.out.println("Sum of element sin an array is "+ " ::" + sum);
    }
    public void common(int a[])
    {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int b[] = new int[10];
      for(int i=0;i<n1;i++)
      {
        b[i] = sc.nextInt();
      }
      for(int m : a)
      {
          for(int u =0; u<n1;u++)
          {
            if(m == b[u] )
            {
              System.out.println("the element is "+ " " + m);
            }
          }
      }
      sc.close();
    }
    public static void main(String[] args) {
        All a1 = new All();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n]; // Create array of size n
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        a1.max_min(a);
        a1.Sum_ele(a);
        a1.common(a);
        sc.close();
    }
}
