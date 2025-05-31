import java.util.*;

class Sum{
   static int addData(int a, int b){
    int c;
    c = a+b;
    return c;
   }
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number 1");
  int num1 = sc.nextInt();
  System.out.println("Enter number 2");
  int num2 = sc.nextInt();
 int val = addData(num1,num2);
  System.out.println("The sum of "+num1 + " + "+num2 +" = "+ val);
  
}
}