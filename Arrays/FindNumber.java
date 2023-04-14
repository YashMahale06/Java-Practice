import java.util.*;

public class FindNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] numbers = new int [size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        int a = sc.nextInt();

        for(int i = 0; i <size; i++){
            if(numbers[i]==a){
                System.out.println(numbers[i] + "Number Found "); 
            }
            else {
                return;
            }
            
        }
        System.out.println("NotFound");
    }
}