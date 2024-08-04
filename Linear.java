import java.util.Scanner;

class Linear {
    static int key;
    static int n;
    
    public void check(int n, int ar[], int key) {
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(ar[i] == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("yes found");
        } else {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        Linear l1 = new Linear();

        System.out.println("Enter the key to search:");
        key = sc.nextInt();

        int ar[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        l1.check(n, ar, key);
        sc.close();
    }
}
