package com.learnig.basics.annotation;

public class CustomAnnotation {
    public static void main(String[] args) {
        String name = "ravindra";
        System.out.print(name.hashCode());
        name = "bankapur";
        System.out.print(name.hashCode());
    }

}

@interface MyAnnotation {
    String name();
    double price();
}

@MyAnnotation(name="name", price=121.2)
class TestClass {

}
