package chapter11_2;

import java.util.function.Predicate;
import java.util.Scanner;

public class PredExample {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

        Predicate<Integer> pr = i -> (i>=18);
        System.out.println(pr.test(20));


//        boolean result = pred(N, (i) -> (i >= 18));
//
//        System.out.println(result);

    }

//    public static boolean pred(int number, Predicate<Integer> pr){
//        return pr.test(number);
//
//    }
}
