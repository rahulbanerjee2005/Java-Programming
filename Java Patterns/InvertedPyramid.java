public class InvertedPyramid {
    public static void inverted_half_pyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){      //print space 
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){        //stars
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        inverted_half_pyramid(4);
    }
}
