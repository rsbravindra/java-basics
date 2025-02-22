package com.learning.dp.creational;

public class SingletonDPDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.doSomething();
        Singleton secondInstance = Singleton.getInstance();
        System.out.println(secondInstance);
        secondInstance.doSomething();
    }
}

class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Doing something with singleton function");
    }
}


