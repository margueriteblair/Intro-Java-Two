package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        var stream2 = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream2.flatMap(list -> list.stream()).forEach(n -> System.out.println(n));

        movies.stream().map(movie -> movie.getTitle()).forEach(n -> System.out.println(n));
    }
}