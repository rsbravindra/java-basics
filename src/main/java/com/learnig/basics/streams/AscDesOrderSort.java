package com.learnig.basics.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscDesOrderSort {
    public static void main(String[] args) {
        List< String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        List<String> sortedList = colors.subList(0,4).stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);

        List<String> sortedList1 = colors.subList(0,4).stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortList = colors.stream().sorted(Comparator.reverseOrder()).toList();

        Collections.sort(colors);
        System.out.println(colors);
        System.out.println(sortList);

    }
}
