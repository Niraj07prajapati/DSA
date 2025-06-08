import java.util.*;

public class program {

    public static void main(String[] args) {
        // max of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();

        int c = Math.max(a, b);
        System.out.println("Output by math function :- " + c);

        int d = a>b?a:b;
        System.out.println("Output by regular method :- "+ d);
    }
}