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
        //sorted(Comparator.comparing(m -> m.getTitle()))
        //sorted(Comparator.comparing(Movie::getTitle))
        movies.stream().sorted((a, b) -> a.getTitle().compareTo(b.getTitle())).forEach(m -> System.out.println(m.getTitle()));
        System.out.println("Method ref:");
        movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(m -> System.out.println(m.getTitle()));
    }
}