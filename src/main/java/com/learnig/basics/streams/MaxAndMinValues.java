package com.learnig.basics.streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxAndMinValues {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(4,11,52,12,64,1);
        System.out.println(set);


        Integer maxSet = set.stream().max(Integer::compare).orElse(null);
        System.out.println(maxSet);

        Integer minSet = set.stream().min(Integer::compare).orElse(null);
        System.out.println(minSet);

        Integer secondSmallest = set.stream().distinct().sorted().skip(1).findAny().get();
        System.out.println(secondSmallest);
    }
}
