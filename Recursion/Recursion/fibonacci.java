public class fibonacci {

    public static int fib(int n) {
        if(n == 0) {
            return 0;

        }

        if(n==1) {
            return 1;

        }
        // a(n-2)+b(n-1) = c

        return fib(n-1)+ fib(n-2);

    }
    public static void main(String[] args) {
        int n =2;
        for(int i=0; i<n; i++) {
            System.err.println(fib(i)+" ");
        }
        
    }
    
}


// with loop


// public class Main {

//     public static void main(String[] args) {

//         int n = 8;

//         int a = 0;
//         int b = 1;

//         System.out.print(a + " " + b + " ");

//         for (int i = 2; i < n; i++) {

//             int c = a + b;
//             System.out.print(c + " ");

//             a = b;
//             b = c;
//         }
//     }
// }
