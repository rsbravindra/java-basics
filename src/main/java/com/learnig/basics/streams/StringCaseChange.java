package com.learnig.basics.streams;

import java.util.List;
import java.util.stream.Stream;
// Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class StringCaseChange {
    public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Raj");
        Stream<String> nameStream = names.stream();
        List<String> upperCase = nameStream.map(String::toUpperCase).toList();
        System.out.println("Upper Case Names " + upperCase);
        List<String> lowerCase = names.stream().map(String::toLowerCase).toList();
        System.out.println("Lower Case Names " + lowerCase);
        List<String> formatterString = names.stream().map(s-> s.formatted("..")).toList();
        System.out.println(formatterString);
        List<String> replaceString = names.stream().map(s-> s.replace("Raj", "Ning")).toList();
        System.out.println(replaceString);
        List<String> caseChangeReplace = replaceString.stream().map(s-> s.replace("N","n")).toList();
        System.out.println(caseChangeReplace);


    }
}
