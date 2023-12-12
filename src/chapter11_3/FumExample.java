package chapter11_3;

import java.util.Date;
import java.util.function.Function;

public class FumExample {
    public static void main(String[] args) {
        //Functionインターフェースのapplyメゾットを使い
        //引数の文字列の長さを返す処置を入れる

        Function<String, Integer> x = String::length;
        System.out.println(x.apply("Hello"));

        //Functionインターフェースのapplyメゾットを使い
        //引数の数値を（整数)を2.0 で割る(少数)

        Function<Integer, Double> f = n -> n/2.0;
        System.out.println(f.apply(18));
    }
}
