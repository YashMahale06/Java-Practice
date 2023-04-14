import java.util.*;

public class factorial {
    public static int factorialOfNumber(int n){
        if(n < 0) {
            System.out.println("Invalid");
            return -1;
        }
        int fact = n;
        for(int i=n-1;i>0;i--){
             fact = fact*i;
        }
        return fact;
    }
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
        int fact =  factorialOfNumber(a);
        System.out.println("Factorial is : " + fact);

    }
}