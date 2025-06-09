import java.util.Scanner;

public class Max_Of_Three_Numbers{
    static int Max1(int a, int b, int c){
        return (a>b && a>c)?a:(b>c?b:c);
    }
    static int Max2(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();

        System.out.println("Max of 3 number using normal method = "+ Max1(a, b, c));
        System.out.println("Max of 3 number using Math function = "+ Max2(a, b, c));
     }
}