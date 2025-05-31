import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1");
        int val1 = sc.nextInt();
        System.out.println("Enter the value 2");
        int val2 = sc.nextInt();
        System.out.println("Before swap " + val1 + " "+ val2);
        int temp;
        temp=val1;
        val1= val2;
        val2 = temp;
        System.out.println("After swap " + val1 + " "+ val2);
    }
}
