import java.util.HashSet;
import java.util.Iterator;

public class allOprations {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        // Insert

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);


        // Search - Contains

        if(set.contains(1)) {
            System.err.println("set contains 1");
        }
        if(!set.contains(6)) {
            System.err.println("does not contain");
        }
        

        // Delete

        set.remove(1);
        if(!set.contains(1)) {
            System.err.println("does not contain 1 - we delete 1");
        }

        // side
        System.err.println("Size is: " + set.size());

        // Print all element
        System.out.println(set);


        // Iterator- notes.txt

        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.err.println(it.next());
        }
    }
    
}
