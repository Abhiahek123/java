import java.util.*;
public class GreaterLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a= sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        if (a==b) {
            System.out.println("Equl");
        }
        else if(a>b) {
            System.out.println("a is Greater");
        }else {
            System.out.println("a is Less");
        }
        sc.close();
    }
    
}
