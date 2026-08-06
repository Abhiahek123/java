
import java.util.HashMap;
import java.util.Map;

public class allOperations {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        // insertion

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Sri Lanka", 25);

        System.out.println(map);

        map.put("China", 180);
        System.err.println(map);


        // Search

        if(map.containsKey("India")) {
            System.err.println("Key is present");
        }else {
            System.out.println("Key is not present");

        }

      // get function 
        System.out.println(map.get("China"));
        System.out.println(map.get("USA"));

        // for(int val : arr)

        // Iterator

        for(Map.Entry<String , Integer> e:map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Remove

        map.remove("China");
        System.out.println(map);
    }

    
    
}
