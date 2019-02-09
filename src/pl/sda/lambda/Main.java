package pl.sda.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //AddInterface add = (a,b)->a+b;
        //System.out.println(add.calc(4,2));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);

        numbers.forEach(System.out::println);


        List<Movie> movies = Arrays.asList(
                new Movie("Tytul", "Jan frodo", LocalDate.of(2012,02,12),
                        460, Arrays.asList("Michał","Maciek")),
                new Movie("Tytul2", "Jan bodo", LocalDate.of(2012,02,12),
                        44.45, Arrays.asList("Michał","Maciek"))

        );

        List<String> titles = movies.stream().map(f -> f.getTitle()).collect(Collectors.toList());
        List<String> title_directors = movies.stream()
                .filter(f->f.getDirector().equals("Jan bodo"))
                .map(f -> f.getTitle())
                .collect(Collectors.toList());

        title_directors.forEach(System.out::println);

        List<Movie> movieList = movies.stream().filter(f-> f.getPrice()>50).collect(Collectors.toList());


    }
}
