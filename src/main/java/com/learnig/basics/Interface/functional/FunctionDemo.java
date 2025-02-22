package com.learnig.basics.Interface.functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> function = i -> i * 20;
//        System.out.println(function.apply(9)); // applies the function on the input and return the output
//        System.out.println(function.andThen(integer -> integer + 10).apply(9));
        System.out.println(function.compose(integer -> 2).apply(21));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(1, 2));

        UnaryOperator<String> unaryOperator = i -> i + " Hello"; // BiFunction is a functional interface>
        System.out.println(unaryOperator.apply("Hi"));

        BinaryOperator<String> binaryOperator = (a, b) -> a + " " + b; // BiFunction is a functional interface>
        System.out.println(binaryOperator.apply("Hi", "Hello"));
    }
}
