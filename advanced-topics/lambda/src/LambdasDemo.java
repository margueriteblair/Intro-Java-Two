package src;

import java.util.List;

public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);
        //imperative programming
        for (var item: list){
            System.out.println(item);
        }
        //Declarative programming
        //there are a lot if different programming paradigms;
        list.forEach((item) -> {System.out.println(item);});
    }

}