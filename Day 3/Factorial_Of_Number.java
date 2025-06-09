import java.util.Scanner;

public class Factorial_Of_Number {
    static int fact1(int n){
        int i, f=1;
        for(i=1;i<=n;i++){
             f = f*i;
        }
        return f;
    }
    static int fact2(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * fact2(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        System.out.println("Factorial using loop = "+ fact1(n));
        System.out.println("Factorial using recurison = "+ fact2(n));
    }
}
