package com.learnig.basics.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String givenString = "Hi Ravi Ri!"; // Hiav!
        Character firstNonRepeatingChar = givenString.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First non repeating characters " + firstNonRepeatingChar);
    }
}
