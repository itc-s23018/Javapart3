package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lesoon3 {
    public static void main(String[] args) {
        List<movie> movies = new ArrayList<>();
        movies.add(new movie("Ironman", 670,2008));
        movies.add(new movie("Thor:Love and Thunder", 362,2022));
        movies.add(new movie("Avengers:Endgame", 3200,2019));
        movies.add((new movie("The Marvels", 290, 2023))
        );

        movies.sort(Comparator.comparing(movie::getTitle));
        movies.forEach(System.out::println);

    }
}
