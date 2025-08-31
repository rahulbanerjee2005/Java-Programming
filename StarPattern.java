public class StarPattern{
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){    //i= lines
            for(int j=1; j<=i; j++){    //j= star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}