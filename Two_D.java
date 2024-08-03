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
        System.out.println(" ");
       }    
       sc.close();

    }
}
