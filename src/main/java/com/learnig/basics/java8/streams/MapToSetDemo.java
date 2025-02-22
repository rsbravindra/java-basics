package com.learnig.basics.java8.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class MapToSetDemo {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        Stream<Map.Entry<String, String>> stream = convertMapToSet(map);
        System.out.println(Arrays.toString(stream.toArray()));

        //converting keySet to Stream without method
        Stream<String> keyStream = map.keySet().stream();
        System.out.println(Arrays.toString(keyStream.toArray()));

        //converting values to Stream without method
        Stream<String> valueStream = map.values().stream();
        System.out.println(Arrays.toString(valueStream.toArray()));

    }

    private static Stream<Map.Entry<String, String>> convertMapToSet(Map<String, String> map) {
        return map.entrySet().stream();
    }


}
