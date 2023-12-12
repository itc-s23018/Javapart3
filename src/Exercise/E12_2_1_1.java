package Exercise;

import java.util.Arrays;
import java.util.Comparator;

public class E12_2_1_1 {
        public static void main(String[] args) {
            var list = Arrays.asList("berry", "banana", "peach", "apple", "orange");

            list.sort(Comparator.reverseOrder());
            list.forEach(System.out::println);
        }
}
