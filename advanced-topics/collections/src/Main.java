package src;

import src.GenericList;

public class Main {
    public static void main(String[] args) throws Exception {
        var list = new GenericList<String>();
        var iterator = list.iterator(); //with this we can loop over our list without knowing anything about its internal implementation
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
            //iterable way to circle through a list
        }
        for (var item:list) {
            System.out.println(item);
        } //the for each loop is syntactical sugar over the for each loop
    }
}
