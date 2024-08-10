// import java.util.*;

// class Palindrome {
//     int n;
//     int rem = 0;  // Declare rem as a class variable

//     public void reverse(int k) {
//         n = k;  // Set n to k to ensure the original value of n is used
//         int res;
//         while (n != 0) {
//             res = n % 10;
//             rem = res + rem * 10;
//             n = n / 10;
//         }
//         System.out.println(rem);
//     }

//     public void check() {
//         if (rem == n) {
//             System.out.println("YES, palindrome");
//         } else {
//             System.out.println("NOT a palindrome");
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Palindrome p1 = new Palindrome();
//         p1.n = sc.nextInt();
//         p1.reverse(p1.n);
//         p1.check();
//         sc.close();
//     }
// }
// string palindrome
import java.util.*;
class Palindrome
{
    String word ;
    String rev = "";

    public void reverse()
    {
        
       //String rev = "";
        for (int i =0;i<word.length();i++)
        {
           rev = word.charAt(i) + rev;
        }
        System.out.println(rev);
    }
    public void check()
    {
        if(word.equals(rev) )
        {
            System.out.println("YES, palindrome");
        
        } else 
        {
        System.out.println("NOT a palindrome");
        } 
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Palindrome p1 = new Palindrome();
        p1.word=sc.nextLine();
        p1.reverse();
        p1.check();
        sc.close();
    }
}