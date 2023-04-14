import java.util.*;

public class Demo {
    public static void myName(String name) {
        System.out.println(name);
        return;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        myName(name);
    }
}