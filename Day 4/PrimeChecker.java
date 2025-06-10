import java.util.Scanner;

public class PrimeChecker {

    // 1. Naive Approach: Check all numbers from 2 to n-1
    public static boolean isPrimeNaive(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. Optimized Approach: Check up to √n
    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 3. Efficient Approach: Skip even numbers after 2
    public static boolean isPrimeEfficient(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check for prime: ");
        int number = sc.nextInt();

        System.out.println("\nChecking with 3 different approaches:");

        System.out.println("1. Naive Approach: " + (isPrimeNaive(number) ? "Prime" : "Not Prime"));
        System.out.println("2. Optimized Approach: " + (isPrimeOptimized(number) ? "Prime" : "Not Prime"));
        System.out.println("3. Efficient Approach: " + (isPrimeEfficient(number) ? "Prime" : "Not Prime"));

    }
}
