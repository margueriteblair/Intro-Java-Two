package src;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var c3 = new Customer("c", "e3");

        Map<String, Customer> map = new HashMap<>();
            map.put(c1.getEmail(), c1);
            map.put(c2.getEmail(), c2);
            //if it doesn't match the valule, it returns null
            //maps a key to a value
            //each piece of data has two components
            //map is not iterable
        for (var customer : map.values()) {
            System.out.println(customer);
        }
    }
}