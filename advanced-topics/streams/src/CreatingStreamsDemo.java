package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        var movies = List.of(
            new Movie("b", 10, Genre.THRILLER),
            new Movie("a", 20, Genre.ACTION),
            new Movie("c", 30, Genre.ACTION)
        );

        IntStream.range(1, 5).forEach(System.out::println); //prints 1-4
        IntStream.rangeClosed(1, 5).forEach(System.out::println); //prints 1-5

    }

}