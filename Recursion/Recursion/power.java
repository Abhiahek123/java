public class power {
    public static int printpower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        // int xPower = printpower(n-1, x);
        // int power = x * xPower;
        // return power;

        // return x* printpower(n-1, x);

        // even

        if (n % 2 == 0) {
            return printpower(x, n / 2) * printpower(x, n / 2);
        } else { // odd
            return printpower(x, n / 2) * printpower(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = printpower(x, n);
        System.out.println(ans);
    }

}
