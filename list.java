import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class list {
    public static void main(String[] args) {
        //lists can be iterated over
        //hashmaps cannot be iterated over
        //four types of lists: arraylist, linkedlists, vector list
        //stack
        List myList = new ArrayList();
        //this specific List is untyped
        //so it can contain elements of type object
        //because arrayList implements this list interface, this is entirely valid
        myList.add("Object 1");
        myList.add(2);
        myList.add("Hello world");
        //add adds elements sequentially
        myList.remove(2); //takes an element or an index
        myList.get(1);
        myList.size();

        //iterating through lists
        Iterator iterator = myList.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next(); //also moves the iterator to the next element

        }


        for (Object next : myList) {
            System.out.println(next);
        }

        for (int i = 0; i < myList.size(); i++) {
            Object next = myList.get(i);
        }

        myList.clear(); //removes all elements from a list

    }
}