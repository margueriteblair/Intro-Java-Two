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
        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream().filter(isPopular).forEach(m -> System.out.println(m.getTitle()));

    }
}