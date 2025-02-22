package com.learnig.basics.collections.listex;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

public class AbstractListWithLinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(2);
        list.add(32);
        list.add(21);
        list.add(2);
        list.add(32);
        list.add(21);
        list.add(2);
        list.add(32);
        list.add(21);

        list.stream().forEach(System.out::println);

        list.remove(3);

        list.stream().forEach(System.out::println);

        System.out.println("Seperator -------");
        System.out.println(list.indexOf(32));
        System.out.println(list.lastIndexOf(32));
        System.out.println(list);

        System.out.println("Seperator -------");
        list.removeIf(i -> i + 1 > 30);
        System.out.println(list);


    }
}
