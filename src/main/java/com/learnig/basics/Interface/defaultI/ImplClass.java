package com.learnig.basics.Interface.defaultI;
// when there are multiple interfaces implemented on a class then it is called multiple inheritance even if the interfaces have default same methods method must be overridden in implementation in order to avoid compile time error and get the functionality
public class ImplClass implements A, B{

    public static void main(String[] args) {
        B b = new ImplClass();
        b.m1();
    }

    @Override
    public void m1() {
        System.out.println("ImplClass m1");
    }
}
