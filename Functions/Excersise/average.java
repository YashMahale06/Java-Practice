import java.util.*;

public class average {
    public static int avgNumber(int a,int b,int c) {
        int avg = (a + b + c)/3;
        return avg;
    }
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter Third number");
        int c = scanner.nextInt();
        int avg = avgNumber(a,b,c);
        System.out.println("Avg is : "+avg);

    }
}