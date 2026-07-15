package Pattern;
import java.util.*;

public class Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt(); // outer loop
        System.out.println("Enter m: ");
        int m = sc.nextInt(); // Inner loop

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(j==1 || i==1 || j==m || i==n) {
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
    
}
