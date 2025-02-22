package com.learnig.basics.streams;

import java.util.Arrays;
import java.util.List;

public class CountNoOfStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Ravindra", "Raja", "Deepak", "Adi", "Mahesh");
        System.out.println(stringList);

        long count = stringList.stream().filter(s->s.startsWith("R")).count();
        System.out.println(count);

        long count1 = stringList.stream().count();
        System.out.println(count1);



    }
}
