package com.learnig.basics.streams;

import java.util.List;
import java.util.stream.Stream;
// 1. Write a Java program to calculate the average of a list of integers using streams.
public class AvgOfListInt {
    public static void main(String[] args) {
        List<Integer> intList = List.of(14,13);
        Stream<Integer> stream = intList.stream();
        Double avg = stream.mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
        System.out.println(avg);
    }
}
