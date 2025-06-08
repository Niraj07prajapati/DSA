import java.util.Scanner;

public class sumOfN {
    static int sum(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        int d = n *(n+1)/2;
      System.out.println("sum of n natural numbers using formula : "+ d);
      System.out.println("Sum of n natural using loop: " + sum);
      System.out.println("Sum of n natural using recursion : "+sum(n));

    }
}
