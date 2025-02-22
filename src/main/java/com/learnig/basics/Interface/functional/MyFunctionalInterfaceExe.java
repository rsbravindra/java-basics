package com.learnig.basics.Interface.functional;

public class MyFunctionalInterfaceExe {

    public static void main(String[] args) {

        MyFunctionInterface my = Integer::sum;
        System.out.println(my.add(39, 20));

        MyFunctionInterface my1 = (a,b) -> a+b;
        System.out.println(my1.add(35, 20));
    }
}
