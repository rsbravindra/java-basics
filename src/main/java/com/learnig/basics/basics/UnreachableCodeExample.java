package com.learnig.basics.basics;
public class UnreachableCodeExample {

    public static void main(String[] args) {
        System.out.println("Hello");
        return;
//        System.out.println("This line will cause an unreachable code error"); // Unreachable code
    }

    void exampleMethod() {
        while (true) {
            break;
            // The following line is unreachable because the loop will always break before it
//            System.out.println("This line is unreachable");
        }
    }

    void anotherExample() {
        try {
            throw new Exception("An exception occurred");
        } catch (Exception e) {
            System.out.println("Exception caught");
            return;
        }
        // The following line is unreachable because the try-catch block always returns
        // or throws an exception
        // System.out.println("This line is unreachable");
    }
}