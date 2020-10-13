package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a", "a@gmail.com"));
        customers.add(new Customer("ab", "ab@gmail.com"));
        customers.add(new Customer("abc", "abc@gmail.com"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);

    }
}
