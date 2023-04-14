import java.util.*;

public class Fibonacci {
    public static void  fibo(int n) {
        int a=1;
        System.out.print("0"+" "+"1");
        for(int i=0; i<n; i++)
        {
            System.out.print(a+" ");
            
            
        }
    }
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
 
        fibo(n);

    }
}