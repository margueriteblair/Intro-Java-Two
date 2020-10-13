package src;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");
        //collections do not support indexing
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list.subList(0, 3));

    }
    
}