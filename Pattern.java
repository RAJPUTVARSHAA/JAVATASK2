public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print("A");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print((char)(i+64));
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("A");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print((char)(i+64));
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("A");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print((char)(i+64));
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("A");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print((char)(i+64));
            System.out.println(" ");
        }
    }
}