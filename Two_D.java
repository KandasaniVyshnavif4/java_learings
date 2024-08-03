import java.util.*;
public class Two_D
{
    static int n,m;
    public static void main(String arge[])
    {
       Scanner sc = new Scanner (System.in);
       n =sc.nextInt();
       m= sc.nextInt();
       int array[][] =new int[n][m];
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
           array[i][j] = sc.nextInt();
        }
       }
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
           System.out.print(+array[i][j]+" ");
        }
        System.out.println(" ");}
       System.out.println("HEAE INSTED WE CAN DO IN ANOTHER WAY AND THIS IS CALLED AS ENHANSED FOR LOOP ");
       for(int n[]:array)
       {
        for (int m:n)
        {
            System.out.print(m+" ");

        }
        System.out.println(" ");
       }
       sc.close();

    
}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
//[jagged array : array containging differ sized coloumns is calle djagged array]
class Two_D
{
    static int n;
   public static void main(String args[])
   {
    Scanner sc =new Scanner(System.in);
    n =sc.nextInt();
    int array[][]=new int[n][];
    System.out.print("enter values");
    int m1 =sc.nextInt();
    System.out.print("enter valuem");
    int m2 =sc.nextInt();
    System.out.print("ebnter ");
    int m3 =sc.nextInt();
    array[0] = new int[m1];
    array[1]=new int[m2];
    array[2]=new int[m3];
    for(int i=0;i<array.length;i++)
    {
        for(int j=0;j<array[i].length;j++)
        {
            array[i][j]=sc.nextInt();
        }
    }
    for (int n[] : array)
    {
        for(int m:n)
        {
            System.out.print(m+" ");
        }
        System.out.println(" ");
    }

    sc.close();
   }
}
