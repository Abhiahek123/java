public class printNumber {
    public static int printNum(int n) {

        if (n == 6) {
            return 0;
        }
        System.out.println(n);
        return printNum(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
}
