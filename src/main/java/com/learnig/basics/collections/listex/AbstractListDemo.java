package com.learnig.basics.collections.listex;

import java.util.*;

public class AbstractListDemo {

    public static void main(String[] args) {
        AbstractList<String> list = new ArrayList<>();
        list.add("A");
        list.add("Ball");

        Iterator i = list.listIterator();
        // The forEachRemaining method of Iterator interface is used to
        // perform the given action for each remaining element. It will
        // traverse the elements of collection until the collection is
        // exhausted. It should not be called again if the iteration has
        // already exhausted all the elements. It will throw
        // NoSuchElementException if the iteration has no more elements.
        i.forEachRemaining(System.out::println);
        // using while to avoid exception
        System.out.println("Using while loop");
        while (i.hasNext()) {
            System.out.println(i.next());
        }


        List<Integer> list1 = new LinkedList<>();
        System.out.println(list1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.removeLast();
        System.out.println(list1);

        list.subList(0, 2).forEach(System.out::println);

        CustomerList list2 = new CustomerList();
        System.out.println(list2);
        list2.add(1212);
        list2.add(2121);
        list2.add(3212);
        list2.add(4212);
        System.out.println(list2);
        list2.removeRangeList(1, 3);
        System.out.println(list2);

    }
}

// removeRange is a protected method so in order to use this method there must be a class which extends ArrayList
class CustomerList extends ArrayList<Integer> {
    public void removeRangeList(int start, int end) {
        removeRange(start, end);
    }
}
