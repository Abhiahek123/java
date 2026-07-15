// Celsius ko Fahrenheit me convert karo.

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius: ");
        double celsius=sc.nextDouble();
        double fehrenheit = (celsius *9/5)+32;
        System.out.println(fehrenheit);
        sc.close();
    }
}