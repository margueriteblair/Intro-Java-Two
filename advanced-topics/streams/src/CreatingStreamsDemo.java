package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        var movies = List.of(
            new Movie("b", 10),
            new Movie("a", 20),
            new Movie("c", 30)
        );
    //getting unique values
    movies.stream()
    .filter(m -> m.getLikes() > 10)
    .peek(m -> System.out.println("filtered: " + m.getTitle()))
    .map(Movie::getTitle)
    .peek(t -> System.out.println("mapped: " + t))
    .forEach(System.out::println);
    }
}