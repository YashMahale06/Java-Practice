public class PalindromicPyramid{
    public static void main(String[] args){
        int n=5;
        int m=1;
    
        for(int i=1; i<=n; i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                
                System.out.print(j);
                
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
}

}


//    1
//   2 2
//  3 3 3
// 4 4 4 4