package com.learnig.basics.Interface.functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        IntPredicate p = i -> i%2 == 0;
        System.out.println(p.test(2));
    }
}
