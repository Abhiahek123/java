public class printNumber {
    public static void printNumbers(int n) {
        if(n==5) {
            return;
        }
        System.out.println(n);
        printNumbers(n+2);
    }
  public static void main(String[] args) {
    int n = 1;
    printNumbers(n);

   
  }
}
