import java.util.*;

public class addNumbers {
    public static int sumNumbers(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static int product(int a,int b) {
        int mul = a * b;
        return mul;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        

        int sum = sumNumbers(a,b);
        int mul = product(a,b);
        System.out.println("Sum is : "+sum);
        System.out.println("Mul is : "+mul);

    }
}