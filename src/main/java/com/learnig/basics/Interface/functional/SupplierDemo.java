package com.learnig.basics.Interface.functional;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}
