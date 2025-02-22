package com.learnig.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class SumOfEvnOddNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,11,3,45,6,6,7,12);
        Stream<Integer> stream = integerList.stream();

        //even sum
        Integer evenSum = stream.filter(i->i%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(evenSum);

        //odd sum
        Integer oddSum = integerList.stream().filter(integer -> {
            return integer % 2 == 1;
        }).mapToInt(Integer::intValue).sum();
        System.out.println(oddSum);


    }
}
