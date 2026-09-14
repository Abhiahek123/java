import java.util.*;
public class inputNumber {
    public static void printNumber(int start , int end) {
        if(start>end) {
            return;
        }
        System.out.println(start);
        printNumber(start+1, end);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Stsrt Number");
        int start = sc.nextInt();
        System.err.println("Enter End Number");
        int end = sc.nextInt();
        printNumber(start, end);
        sc.close();

        
        
    }
    
}
