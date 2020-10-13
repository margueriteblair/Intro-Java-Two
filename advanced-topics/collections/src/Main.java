package src;

import src.GenericList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a"));
        customers.add(new Customer("ab"));
        customers.add(new Customer("abc"));
        Collections.sort(customers);
        System.out.println(customers);

    }
}
