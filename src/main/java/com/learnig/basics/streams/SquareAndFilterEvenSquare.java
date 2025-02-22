package com.learnig.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SquareAndFilterEvenSquare {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        Set<Integer> filterSet = integerList.stream().map(e -> e * e).filter(e -> e%2==0).collect(Collectors.toSet());
        System.out.println(filterSet);
    }
}
