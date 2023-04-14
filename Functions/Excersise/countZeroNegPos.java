import java.util.*;

public class countZeroNegPos {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of input number");
        int n = scanner.nextInt();
        int zero = 0;
        int pos =0;
        int neg =0;
        for(int i = 0; i < n; i++){
            int a = scanner.nextInt();
            if(a == 0 ){
                zero++;
            }
            else if (a>0){
                pos++;

            }
            else{
                neg++;
            }

        }

        System.out.println("No of Zeros : "+zero+" "+"No of negetive : "+neg+" "+"No of Positive : "+pos+" ");
     

    }
}