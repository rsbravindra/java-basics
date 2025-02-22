package com.learnig.basics.streams.strings;

import java.util.stream.Stream;

public class FirstElementOfStream {
    public static void main(String[] args) {
        String str = "Hello hi How Are you";
        Stream<String> stream = Stream.of(str);
        System.out.println(stream);

        //using reduce
        String firstElement = stream.reduce((first, second) -> first).orElse(null);
        System.out.println(firstElement);

        //using findFirst
        String fEl = Stream.of(str).findFirst().orElse(null);
        System.out.print(fEl);
    }
}
