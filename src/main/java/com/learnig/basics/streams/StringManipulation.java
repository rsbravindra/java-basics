package com.learnig.basics.streams;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Gee ksfor geeks";
        System.out.println("Char at given index :" + str.charAt(1));
        System.out.println("Convert to lower case: " + str.toLowerCase());
        System.out.println("Convert to upper case: " + str.toUpperCase());
        System.out.println("Get bytes array as per UTF Char Encoding: " + Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));
        System.out.println("Length of given String: " + str.length());
        System.out.println("Convert to Locale: " + str.toLowerCase(Locale.ROOT));
        str.chars().forEach(System.out::print);
        System.out.println();
        System.out.println("Index of give character " + str.indexOf('s', 1));
        System.out.println(str.subSequence(4,13));
        // remove space in given string

        List<IntStream> chArr = Stream.of(str.chars()).toList();

        System.out.println(str.chars().iterator());
    }
}
