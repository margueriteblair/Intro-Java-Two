package src;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    public static void show() {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = (String item) -> System.out.println(item);
        
    }

}