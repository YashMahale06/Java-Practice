import java.util.*;

public class oddNumOneToN {
    public static int sumOddNum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }

        return sum;
    }
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = scanner.nextInt();
       
        int sum = sumOddNum(n);
        System.out.println("sum is : "+sum);

    }
}