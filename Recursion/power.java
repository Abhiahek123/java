public class power {
    public static int printpower(int n, int x) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        // int xPower = printpower(n-1, x);
        // int power = x * xPower;
        // return power;

        return x* printpower(n-1, x);

    }

    public static void main(String[] args) {

        int n = 5;
        int x = 2;
        int ans = printpower(n, x);
        System.out.println(ans);
    }

}
