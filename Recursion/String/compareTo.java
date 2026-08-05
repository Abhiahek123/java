public class compareTo {
    public static void main(String[] args) {
        String name1 = "tony";
        String name2 = "tony";

        //compare

        // 1. s1>s2 : +ve value
        // 2. s1==s2: 0
        // 3. s1<s2: -ve value
        if(name1.compareTo(name2)==0) {
            System.out.println("String are equal");
        }else {
                System.out.println("String are not equal");
        }
    }
    
}
