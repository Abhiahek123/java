import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter present salary: ");
        float salary = sc.nextFloat();
        float bonus = salary*10/100;
        float Total_Salary = salary+bonus;
        System.out.println("Total salary :"+Total_Salary);
        sc.close();

    }
    
}
