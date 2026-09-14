package Function;

import java.util.*;

public class Sum {

    public static int add(int a , int b) {
        // System.out.println(a+b);
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int printadd=add(a,b);
        // System.out.println(printadd);

        System.out.println(add(a, b));
        sc.close();

       
        
    }
}
