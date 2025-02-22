package com.learnig.basics.Interface.defaultI;

/**
 * This class is a demonstration of the Diamond Problem of Multiple Inheritance in Java.
 * Diamond problem occurs when a class implements two interfaces which have a common parent interface
 * containing a default method. In this case Java does not know which default method to call.
 * To avoid this problem java forces you to implement the conflicting method in the implementing class.
 * Here the class implements two interfaces Aa and Bb which have a common parent interface containing
 * a default method. So here the class is forced to implement the conflicting method m1.
 */
public class DefaultMethodTest implements Aa, Bb {

    @Override
    public void m1() {
        Aa.super.m1();
        Bb.super.m1();
    }

    public static void main(String[] args) {
        DefaultMethodTest defaultMethodTest = new DefaultMethodTest();
        defaultMethodTest.m1();
    }
}

interface Aa {
    default void m1() {
        System.out.println("A");
    }
}

interface Bb {
    default void m1() {
        System.out.println("B");
    }
}