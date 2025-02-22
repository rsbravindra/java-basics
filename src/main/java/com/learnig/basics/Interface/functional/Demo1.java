package com.learnig.basics.Interface.functional;

// in this example we are using lambda expression to implement the runnable interface.
public class Demo1 {
    public static void main(String[] args) {
        new Thread( () -> System.out.println("New Thread Created")).start();

        // another way of creating and running thread using Runnable interface and Thread class
        Demo2 d = new Demo2();

        Thread t1 = new Thread(d);
        t1.start();


    }


}

class Demo2 implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("New Thread Created with implementation of Runnable Interface");
    }

}
