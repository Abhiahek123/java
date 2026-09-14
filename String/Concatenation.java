import java.util.*;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Abhi";
        String lastName ="Singh";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for(int i=0; i<fullName.length(); i++) {
            System.err.println(fullName.charAt(i));
        }
      ;
        sc.close();
    }
    
}
