package com.learnig.basics.collections.listex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class SetToStream {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(null);

        Stream<Integer> stream = set.stream();
        System.out.println(Arrays.toString(stream.toArray()));
//        System.out.println(stream.count()); // as the stream been operated already with one terminal operator once, it can't be operated further.

        Stream stream1 =  Stream.of(set);
        System.out.println(Arrays.toString(stream1.toArray()));

        Set<String> setOfString = new HashSet<>(
          Arrays.asList("Hello","Welcome","World","Java","Stream")
        );

        System.out.println("-----------" + setOfString);

        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("H");
            }
        };

        Stream<String> streamFilter = setOfString.stream().filter(p);
        System.out.println(Arrays.toString(streamFilter.toArray()));


    }
}
