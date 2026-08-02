public class printNum {

    public static void printNumber(int n) {
        if(n>=100) {
            return;
        }
        System.out.println(n);
        printNumber(n+2);
    }
    public static void main(String[] args) {
        int n = 2;
        printNumber(n);

    }
    
}
