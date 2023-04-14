public class CenterPyramid{
    public static void main(String[] args){
        int n=5;
    
        for(int i=1; i<=n; i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
}

}


//    1
//   2 2
//  3 3 3
// 4 4 4 4