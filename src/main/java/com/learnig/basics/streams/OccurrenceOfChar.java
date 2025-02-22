package com.learnig.basics.streams;

import java.util.ArrayList;
import java.util.List;



public class OccurrenceOfChar {
    public static void main(String[] args) {
        String str = "I am Java Developer";
        char [] ch = str.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for(char c: ch) {
            characterList.add(c);
        }

        long count = 0;
        for(int i=0;i<ch.length;i++) {
            int finalI = i;
            count = characterList.stream().filter(c -> c == ch[finalI]).count();
            System.out.println("Char Occurance "+ch[i]+" :"+count);
        }
        System.out.println(count);
    }
}
