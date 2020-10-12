package src;
//T represents the type of objects we want to store in our list
public class GenericList<T>{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}