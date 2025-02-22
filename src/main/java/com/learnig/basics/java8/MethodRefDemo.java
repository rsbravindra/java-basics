package com.learnig.basics.java8;

import java.util.Arrays;

public class MethodRefDemo {
    public static void main(String[] args) {
        String [] names = {"Job", "Bob", "Cab"};
        Arrays.stream(names).forEach(MethodRefDemo::print);
    }

    public static void print(String s){
        System.out.println(s);
    }
}
