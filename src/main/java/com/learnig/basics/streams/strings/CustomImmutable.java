package com.learnig.basics.streams.strings;

public class CustomImmutable {
    public static void main(String[] args) {
        Demo d = new Demo("Ravindra", 1234);
    }
}

final class Demo {
    private String name;
    private long id;
    Demo(String name, long id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public long getId() {
        return id;
    }
}