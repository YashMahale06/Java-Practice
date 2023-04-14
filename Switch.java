import java.util.*;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();

        switch (button) {
            case 1 : System.out.println("Hello"); break;
            case 2 : System.out.println("namaste"); break;
            case 3 : System.out.println("byee"); break;
            default : System.out.println("good bye"); break;
        }
    }
}