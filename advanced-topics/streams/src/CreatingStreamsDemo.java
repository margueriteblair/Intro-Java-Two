package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers).forEach(n -> System.out.println(n));
        var stream = Stream.generate(() -> Math.random());
        stream.forEach(item -> System.out.println(item));
    }
}