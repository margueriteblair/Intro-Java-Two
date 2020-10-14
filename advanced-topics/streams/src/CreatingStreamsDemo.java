package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );
        movies.stream()
        .skip(2)
        .forEach(m->System.out.println(m.getTitle()));

        movies.stream().takeWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle()));
    }
}