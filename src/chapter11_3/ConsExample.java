package chapter11_3;

import java.util.function.Consumer;

public class ConsExample {
    public static void main(String[] args) {

        //Consumerインターフェースをacceptメゾットを使い
        //引数の値を出力する

        Consumer<String> str = System.out::println;
        str.accept("Hello");

    }
}
