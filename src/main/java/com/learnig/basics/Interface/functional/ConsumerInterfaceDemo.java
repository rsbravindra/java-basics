package com.learnig.basics.Interface.functional;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) throws Exception {

        // General Syntax Consumer<Integer> consumer = (value) -> System.out.println(value);

        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Hello with Lambda Expression");

        Consumer<String> c1 = System.out::println;
        c1.accept("Hello with Method Reference");

        DoubleConsumer dc = System.out::println; // DoubleConsumer is a functional interface>
        dc.accept(121212);

        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(121212);

        LongConsumer longConsumer = System.out::println;
        longConsumer.accept(121212);

    }
}
