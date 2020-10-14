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
    var result = movies.stream()
    .max(Comparator.comparing(Movie::getLikes))
    .get();//allows us to find the movie with the max number of likes
    System.out.println(result.getTitle());
    }
}