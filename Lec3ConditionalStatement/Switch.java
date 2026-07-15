import java.util.*;
public class Switch {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Case Number:");
        int button =sc.nextInt();

        switch (button) {
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namsate");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid Button");
        }
        sc.close();
    }
    
}
