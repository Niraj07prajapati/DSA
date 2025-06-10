import java.util.Scanner;

public class Tribonacci {

    // Function to compute the n-th Tribonacci number
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1, d = 0;

        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (to find the n-th Tribonacci number): ");
        int n = sc.nextInt();

        int result = tribonacci(n);
        System.out.println("Tribonacci(" + n + ") = " + result);

        // Optional: Print the whole Tribonacci sequence up to n
        System.out.print("Tribonacci sequence up to n: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(tribonacci(i) + " ");
        }

        sc.close();
    }
}
