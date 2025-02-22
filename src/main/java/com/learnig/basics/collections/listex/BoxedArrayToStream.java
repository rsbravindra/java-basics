package com.learnig.basics.collections.listex;


import java.awt.*;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class BoxedArrayToStream {
    public static void main(String[] args) {
        String array[] = {"Pen", "Pencil", "Book", "Headphones"};
        Stream<String> stream = Arrays.stream(array);
        System.out.println(Arrays.toString(stream.toArray()));

        Stream<String> stream1 = Stream.of(array);
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<String> stream2 = Arrays.asList(array).stream();
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<String> stream3 = Arrays.stream(array);
        System.out.println(Arrays.toString(stream3.toArray()));
    }
}
