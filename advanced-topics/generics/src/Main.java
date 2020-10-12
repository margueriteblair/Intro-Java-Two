package src;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<Integer>(); //cannot pass in int, float
        //every primitive type has a wrapper class
        //int -> Integer
        //float -> Float
        //boolean -> Boolean
        numbers.add(1); //boxing, java compiler will put this value inside a box
        int numb = numbers.get(0); //unboxing
        System.out.println(numb);
    }
}