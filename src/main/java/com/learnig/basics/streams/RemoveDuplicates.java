package com.learnig.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Write a Java program to remove all duplicate elements from a list using streams.
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Ravi", "Ravi", "Raj", "Ning");
        System.out.println(namesList);

        Stream<String> stringStream = namesList.stream();
        List<String> uniqueNames = stringStream.distinct().collect(Collectors.toList());
        System.out.println(uniqueNames);
    }
}
