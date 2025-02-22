package com.learnig.basics.Interface.functional;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable {

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(10);
        Thread.sleep(randomNumber * 1000);
        return randomNumber;
    }

    public static void main(String[] args) throws Exception {
        FutureTask[] randomNumberTask = new FutureTask[5];
        for (int i=0; i<5; i++) {
            Callable callable = new CallableDemo();
            randomNumberTask[i] = new FutureTask(callable);
            new Thread(randomNumberTask[i]).start();
        }
        for (int i=0; i<5; i++) {
            System.out.println(randomNumberTask[i].get());
        }
    }
}
