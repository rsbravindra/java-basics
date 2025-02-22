package com.learnig.basics.collections.listex;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveArrayToStream {
    public static void main(String[] args) {
        int array [] = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(array);
        System.out.println(Arrays.toString(stream.toArray()));

        IntStream stream2 = IntStream.of(array);
        System.out.println(Arrays.toString(stream2.toArray()));

        Double array1 [] = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stream<Double> doubleStream =  Stream.of(array1);
        System.out.println(Arrays.toString(doubleStream.toArray()));
    }
}
