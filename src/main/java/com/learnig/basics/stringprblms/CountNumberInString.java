package com.learnig.basics.stringprblms;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountNumberInString {
    public static void main(String[] args) {
        String s = "12345";

        long sum = s.chars().map(Character::getNumericValue).sum();
        System.out.println(sum);



        String st = "I love you";
        long vovels = st.toLowerCase().chars().filter(c -> new String("aeiou").indexOf(c) == -1).count();
        System.out.println(vovels);

        st.toLowerCase().chars().map(operand -> operand).count();

    }
}
